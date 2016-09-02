package com.cloudream.hime.business.module.verification.fragment;

import android.content.Context;
import android.media.audiofx.LoudnessEnhancer;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.InputType;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.cloudream.hime.business.R;
import com.cloudream.hime.business.base.BaseFragment;
import com.cloudream.hime.business.module.verification.presenter.VerificationPresenter;
import com.cloudream.hime.business.weight.InputKeyBoardView;

import org.w3c.dom.Text;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by admin on 2016/8/29.
 */
public class VerificationFragment extends BaseFragment implements InputKeyBoardView.OnClickNumber, VerificationFragmentView {
    private static VerificationFragment mInstance = new VerificationFragment();
    private Map<Integer, TextView> textViewMap = null;
    private StringBuilder editTextStr = new StringBuilder();
    private VerificationPresenter verificationPresenter;
    private int flag = 0;
    private View view;
    private static Context mContext;
    @Bind(R.id.txt_input_error_title)
    TextView txtInputErrorTitle;
    @Bind(R.id.input_keyboard)
    InputKeyBoardView inputKeyboard;
    @Bind(R.id.txt_edt_1)
    TextView txtEdt1;
    @Bind(R.id.txt_edt_2)
    TextView txtEdt2;
    @Bind(R.id.txt_edt_3)
    TextView txtEdt3;
    @Bind(R.id.txt_edt_4)
    TextView txtEdt4;
    @Bind(R.id.txt_edt_5)
    TextView txtEdt5;
    @Bind(R.id.txt_edt_6)
    TextView txtEdt6;
    @Bind(R.id.txt_edt_7)
    TextView txtEdt7;
    @Bind(R.id.txt_edt_8)
    TextView txtEdt8;


    public static VerificationFragment getInstance(Bundle args, Context context) {
        mContext = context;
        if (mInstance == null) {
            mInstance = new VerificationFragment();
        }
        mInstance.setArguments(args);
        return mInstance;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_verification, null);
        ButterKnife.bind(this, view);
        initView();
        return view;
    }

    private void initView() {
        verificationPresenter = new VerificationPresenter(this);
        inputKeyboard.setOnClickNumber(this);
        textViewMap = new HashMap<Integer, TextView>();
        textViewMap.put(1, txtEdt1);
        textViewMap.put(2, txtEdt2);
        textViewMap.put(3, txtEdt3);
        textViewMap.put(4, txtEdt4);
        textViewMap.put(5, txtEdt5);
        textViewMap.put(6, txtEdt6);
        textViewMap.put(7, txtEdt7);
        textViewMap.put(8, txtEdt8);
    }


    @Override
    public void getClickNumber(int number) {
        Log.e(";ong", "flage:" + number);
        if (number == -1 && flag >= 1 && editTextStr.length() > 0) {  //退格
            deleteEditText();
        } else if (flag < 8 && number != -1) {
            flag++;
            setEditText(number);
        }
    }

    private void deleteEditText() {
        txtInputErrorTitle.setText("");
        textViewMap.get(flag).setText("");
        editTextStr.deleteCharAt(flag - 1);
        flag--;
    }

    private void setEditText(int number) {
        textViewMap.get(flag).setText(String.valueOf(number));
        editTextStr.append(number);
        if (editTextStr.length() == 8) {
            Toast.makeText(mContext, "请求", Toast.LENGTH_SHORT).show();
            verificationPresenter.request(editTextStr.toString().trim());
        }
    }
    /*
    切换到其他页面的时候需要将已经记录的券号清空
     */
    public void setFlag() {
        editTextStr.delete(0, editTextStr.length());
        flag = 0;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
        if (textViewMap != null) {
            textViewMap.clear();
            textViewMap = null;
        }
    }

    @Override
    public void showErrorInfo(String string) {
        txtInputErrorTitle.setText(string);
    }

    @Override
    public void ShowActivity(String string) {
        txtInputErrorTitle.setText(string);
    }
}
