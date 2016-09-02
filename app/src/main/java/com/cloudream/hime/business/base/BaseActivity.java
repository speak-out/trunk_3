package com.cloudream.hime.business.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.cloudream.hime.business.R;

import butterknife.Bind;
import butterknife.ButterKnife;


public abstract class BaseActivity extends AppCompatActivity {
    RelativeLayout llTopContain;
    RelativeLayout rlCenterContain;
    private View topView;
    private View CenterView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_layout);
        llTopContain = (RelativeLayout) findViewById(R.id.rl_top_contain);
        rlCenterContain = (RelativeLayout) findViewById(R.id.rl_center_contain);
//        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        topView = setTopView();
        CenterView = setCenterView();
        if (topView != null) {
            llTopContain.removeAllViews();
            llTopContain.addView(topView);
        } else {
            llTopContain.setVisibility(View.GONE);
        }
        if (CenterView != null) {
            rlCenterContain.removeAllViews();
            rlCenterContain.addView(CenterView);
        }
    }

    protected abstract View setTopView();

    public abstract View setCenterView();

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}