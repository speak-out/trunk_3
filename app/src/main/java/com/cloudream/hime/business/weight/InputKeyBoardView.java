package com.cloudream.hime.business.weight;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cloudream.hime.business.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by yuer on 2016/8/31.
 */
public class InputKeyBoardView extends RelativeLayout {

    @Bind(R.id.txt_1)
    TextView txt1;
    @Bind(R.id.txt_2)
    TextView txt2;
    @Bind(R.id.txt_3)
    TextView txt3;
    @Bind(R.id.txt_4)
    TextView txt4;
    @Bind(R.id.txt_5)
    TextView txt5;
    @Bind(R.id.txt_6)
    TextView txt6;
    @Bind(R.id.txt_7)
    TextView txt7;
    @Bind(R.id.txt_8)
    TextView txt8;
    @Bind(R.id.txt_9)
    TextView txt9;
    @Bind(R.id.txt_0)
    TextView txt0;
    @Bind(R.id.txt_delete)
    TextView txtDelete;
    private View view;
    private OnClickNumber listenr ;
    public InputKeyBoardView(Context context) {
        this(context, null);
    }
    public InputKeyBoardView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    private void initView(Context context) {
        view = View.inflate(context, R.layout.key_board_view, null);
        ButterKnife.bind(this, view);
        addView(view);
    }
    @OnClick({R.id.txt_1, R.id.txt_2, R.id.txt_3, R.id.txt_4, R.id.txt_5, R.id.txt_6, R.id.txt_7, R.id.txt_8, R.id.txt_9, R.id.txt_0, R.id.txt_delete})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.txt_1:
                sendMethod(1);
                break;
            case R.id.txt_2:
                sendMethod(2);
                break;
            case R.id.txt_3:
                sendMethod(3);
                break;
            case R.id.txt_4:
                sendMethod(4);
                break;
            case R.id.txt_5:
                sendMethod(5);
                break;
            case R.id.txt_6:
                sendMethod(6);
                break;
            case R.id.txt_7:
                sendMethod(7);
                break;
            case R.id.txt_8:
                sendMethod(8);
                break;
            case R.id.txt_9:
                sendMethod(9);
                break;
            case R.id.txt_delete:
                sendMethod(-1);
                break;
            case R.id.txt_0:
                sendMethod(0);
                break;
        }
    }

    private void sendMethod(int i) {
        if(listenr!=null){
            listenr.getClickNumber(i);
        }
    }

    public interface  OnClickNumber{
        void getClickNumber(int number);
    }
    public void setOnClickNumber(OnClickNumber s){
        listenr = s;
    }
}
