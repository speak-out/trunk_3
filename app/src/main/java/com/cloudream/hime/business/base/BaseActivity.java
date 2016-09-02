package com.cloudream.hime.business.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

import com.cloudream.hime.business.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {

    @Bind(R.id.rl_top_contain)
    RelativeLayout llTopContain;
    @Bind(R.id.rl_center_contain)
    RelativeLayout rlCenterContain;
    private View topView;
    private View CenterView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_layout);
        ButterKnife.bind(this);
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
}