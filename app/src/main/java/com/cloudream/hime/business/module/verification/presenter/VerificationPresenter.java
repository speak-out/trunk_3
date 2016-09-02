package com.cloudream.hime.business.module.verification.presenter;

import com.cloudream.hime.business.base.BasePresenter;
import com.cloudream.hime.business.bean.Params;
import com.cloudream.hime.business.common.RequestMethod;
import com.cloudream.hime.business.common.retrofit.RequestEntity;
import com.cloudream.hime.business.module.verification.fragment.VerificationFragment;
import com.cloudream.hime.business.module.verification.fragment.VerificationFragmentView;

/**
 * Created by yuer on 2016/9/2.
 */
public class VerificationPresenter extends BasePresenter{
    public VerificationFragmentView mVerificationFragmentView;
    public VerificationPresenter(VerificationFragmentView mVerificationFragmentView){
        this.mVerificationFragmentView = mVerificationFragmentView;
    }

    /**
     *
     * @param trim
     */
    public void request(String trim) {
        Params params = new Params();
        params.setCityId("440300");
        params.setType("3");
        arrayListParams.add(params);
        baseBean.setParams(arrayListParams);
        subscription = RequestEntity.request(RequestEntity.getApiService().getCorplist(baseBean), this,params.toString()+ RequestMethod.getCorplist,false);
    }

    @Override
    public void onSuccee(Object response, String code) {
        super.onSuccee(response, code);
        mVerificationFragmentView.showErrorInfo("是的呢，请求成功了");
    }

    @Override
    public void onError(Throwable e) {
        super.onError(e);
        mVerificationFragmentView.showErrorInfo("不对，请求失败了");
    }

    @Override
    public void onCompleted() {
        super.onCompleted();
        mVerificationFragmentView.showErrorInfo("请求完成了");
    }
}
