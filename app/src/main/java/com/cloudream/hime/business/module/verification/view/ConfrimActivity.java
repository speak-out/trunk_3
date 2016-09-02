package com.cloudream.hime.business.module.verification.view;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cloudream.hime.business.R;
import com.cloudream.hime.business.base.BaseActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by yuer on 2016/9/2.
 */
public class ConfrimActivity extends BaseActivity {

    @Bind(R.id.tv_back)
    TextView tvBack;
    @Bind(R.id.rl_left)
    RelativeLayout rlLeft;
    @Bind(R.id.tv_title)
    TextView tvTitle;

    @Override
    protected View setTopView() {
        View topView = getLayoutInflater().inflate(R.layout.title_view, null);
        ButterKnife.bind(this, topView);
        initTopView();
        return topView;
    }

    @Override
    public View setCenterView() {
        View centerView = getLayoutInflater().inflate(R.layout.activity_confrim, null);
        ButterKnife.bind(this, centerView);
        initCenterView();
        return centerView;
    }

    private void initCenterView() {
    }

    private void initTopView() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
