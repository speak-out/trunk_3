package com.cloudream.hime.business.module.income.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cloudream.hime.business.R;
import com.cloudream.hime.business.base.BaseFragment;

/**
 * Created by admin on 2016/8/29.
 */
public class IncomeFragment extends BaseFragment {
    private static IncomeFragment mInstance = new IncomeFragment();
    public static IncomeFragment getInstance(Bundle args) {
        if(mInstance == null) {
            mInstance = new IncomeFragment();
        }
        mInstance.setArguments(args);
        return mInstance;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_income,null);
    }
}
