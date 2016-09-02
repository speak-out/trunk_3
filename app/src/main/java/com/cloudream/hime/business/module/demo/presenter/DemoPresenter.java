package com.cloudream.hime.business.module.demo.presenter;

import android.util.Log;

import com.cloudream.hime.business.base.BasePresenter;
import com.cloudream.hime.business.bean.Params;
import com.cloudream.hime.business.common.ApiService;
import com.cloudream.hime.business.common.RequestMethod;
import com.cloudream.hime.business.common.retrofit.RequestEntity;
import com.cloudream.hime.business.module.demo.view.IdemoView;

import rx.Observable;

/**
 * Created by admin on 2016/8/29.
 */
public class DemoPresenter extends BasePresenter{

    private IdemoView mDemoView;

    public DemoPresenter(IdemoView demoView){
        mDemoView = demoView;
    }

    public void getDemo(){
        Params params = new Params();
        params.setCityId("440300");
        params.setType("3");
        arrayListParams.add(params);
        baseBean.setParams(arrayListParams);
        subscription = RequestEntity.request(RequestEntity.getApiService().getCorplist(baseBean), this,params.toString()+ RequestMethod.getCorplist);
    }

    public void getArea(){
        Params params1 = new Params();
        params1.setCityId("440300");
        params1.setType("3");
        arrayListParams.add(params1);
        baseBean.setParams(arrayListParams);
        Observable observable = apiService.GetAear(baseBean);
        subscription =  RequestEntity.request(observable,this,params1.toString()+RequestMethod.getArea);
    }

    @Override
    public void onSuccee(Object response, String code) {
        if(response != null) {
            mDemoView.setTextView("code:"+code+"----"+response.toString());
        }
    }

    @Override
    public void onError(Throwable e) {
        if(e != null) {
            Log.e("yzmhand", e.toString());
        }
    }
}
