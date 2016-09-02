package com.cloudream.hime.business.module.me.view;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.cloudream.hime.business.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by yuer on 2016/9/2.
 */
public class ChangePasswordActivity extends Activity {
    @Bind(R.id.edit_pwd_one)
    EditText editPwdOne;
    @Bind(R.id.edit_pwd_two)
    EditText editPwdTwo;
    @Bind(R.id.tv_confrim)
    TextView tvConfrim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changepwd);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.tv_confrim)
    public void onClick() {
    }
}
