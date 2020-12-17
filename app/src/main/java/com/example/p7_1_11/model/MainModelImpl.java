package com.example.p7_1_11.model;

import com.example.p7_1_11.contract.MainContract;
import com.example.p7_1_11.utils.net.INetCallBack;
import com.example.p7_1_11.utils.net.RetrofitUtils;

public class MainModelImpl implements MainContract.IMainModel {
    private MainContract.IMainPresenter presenter;

    public MainModelImpl(MainContract.IMainPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public <T> void getLoginData(String url, INetCallBack<T> callBack) {
        presenter.loginResult("成功");
        RetrofitUtils.getInstance().get(url,callBack);
    }
}
