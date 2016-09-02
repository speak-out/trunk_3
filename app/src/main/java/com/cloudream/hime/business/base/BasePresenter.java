package com.cloudream.hime.business.base;

import android.util.Log;

import com.cloudream.hime.business.bean.BaseBean;
import com.cloudream.hime.business.bean.Params;
import com.cloudream.hime.business.common.ApiService;
import com.cloudream.hime.business.common.retrofit.RequestEntity;
import com.cloudream.hime.business.common.retrofit.ResponseInterface;

import java.util.ArrayList;

import rx.Subscription;

/**
 * Created by admin on 2016/8/29.
 */
public class BasePresenter implements ResponseInterface {
    protected Subscription subscription = null;
    protected BaseBean baseBean;
    protected ArrayList arrayListParams;
    protected ApiService apiService;

    public BasePresenter() {
        if (baseBean == null) {
            baseBean = new BaseBean<>();
        } else {
            baseBean.setParams(null);
        }
        if (arrayListParams == null) {
            arrayListParams = new ArrayList<>();
        } else {
            arrayListParams.clear();
        }
        apiService = RequestEntity.getApiService();
    }

    @Override
    public void onSuccee(Object response, String code) {
    }

    @Override
    public void onError(Throwable e) {
    }

    @Override
    public void onCompleted() {

    }

    public void unsubscribe() {  //解除关联
        if (subscription != null && !subscription.isUnsubscribed()) {
            subscription.unsubscribe();
        }
    }
}
