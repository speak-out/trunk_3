package com.cloudream.hime.business.module.verification.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.cloudream.hime.business.R;
import com.cloudream.hime.business.base.BaseActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by yuer on 2016/9/2.
 */
public class ConfrimActivity extends BaseActivity implements View.OnClickListener {
    @Bind(R.id.tv_item_name)
    TextView tvItemName;
    @Bind(R.id.tv_item_price)
    TextView tvItemPrice;
    @Bind(R.id.iv_item_state)
    ImageView ivItemState;
    @Bind(R.id.tv_item_state)
    TextView tvItemState;
    @Bind(R.id.tv_button)
    TextView tvButton;
    @Bind(R.id.tv_back)
    TextView tvBack;
    @Bind(R.id.rl_left)
    RelativeLayout rlLeft;
    @Bind(R.id.tv_title)
    TextView tvTitle;
    @Bind(R.id.rl_right)
    RelativeLayout rlRight;

    @Override
    protected View setTopView() {
        View topView = getLayoutInflater().inflate(R.layout.title_view, null);
        initTopView();
        return topView;
    }

    @Override
    public View setCenterView() {
        View centerView = getLayoutInflater().inflate(R.layout.activity_confrim, null);
        initCenterView();
        return centerView;
    }

    private void initCenterView() {
    }

    private void initTopView() {
    }

    @Nullable
    @Override
    public void onClick(View view) {
        Toast.makeText(this, ";;", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
    @Nullable
    @OnClick(R.id.tv_button)
    public void onClick() {
        Toast.makeText(this,";;;;;;",Toast.LENGTH_SHORT).show();
    }
}
