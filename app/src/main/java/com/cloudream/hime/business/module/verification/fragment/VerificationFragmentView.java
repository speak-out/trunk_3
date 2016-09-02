package com.cloudream.hime.business.module.verification.fragment;

/**
 * Created by yuer on 2016/9/2.
 */
public interface VerificationFragmentView {

    /**
     * 查询订单没有结果
     * @param string
     */
    void showErrorInfo(String string);

    /**
     * 查询到结果，进行跳转
     * @param string
     */
    void ShowActivity(String string);
}
