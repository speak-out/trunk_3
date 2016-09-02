package com.cloudream.hime.business.module.me.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cloudream.hime.business.R;
import com.cloudream.hime.business.base.BaseFragment;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by admin on 2016/8/29.
 */
public class MeFragment extends BaseFragment {

    private static MeFragment mInstance = new MeFragment();
    @Bind(R.id.tv_my_shop_name)
    TextView tvMyShopName;
    @Bind(R.id.rl_my_head_bg)
    RelativeLayout rlMyHeadBg;
    @Bind(R.id.my_card)
    LinearLayout myCard;
    @Bind(R.id.my_call_me)
    LinearLayout myCallMe;
    @Bind(R.id.my_give_me_se)
    LinearLayout myGiveMeSe;
    @Bind(R.id.my_change_pwd)
    LinearLayout myChangePwd;
    @Bind(R.id.my_sign_out)
    LinearLayout mySignOut;
    @Bind(R.id.iv_show_card_is)
    ImageView ivShowCardIs;

    public static MeFragment getInstance(Bundle args) {
        if (mInstance == null) {
            mInstance = new MeFragment();
        }
        mInstance.setArguments(args);
        return mInstance;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_my, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @OnClick({R.id.rl_my_head_bg, R.id.my_card, R.id.my_call_me, R.id.my_give_me_se, R.id.my_change_pwd, R.id.my_sign_out})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rl_my_head_bg:
                Log.e("..........", "onClick: ");
                break;
            case R.id.my_card:
                Log.e("..........", "asdfsafdssddsf: ");
                break;
            case R.id.my_call_me:
                Log.e("..........", "a555555555555");
                break;
            case R.id.my_give_me_se:
                break;
            case R.id.my_change_pwd:
                break;
            case R.id.my_sign_out:
                break;
        }
    }
}
