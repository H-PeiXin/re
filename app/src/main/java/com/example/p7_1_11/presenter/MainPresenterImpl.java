package com.example.p7_1_11.presenter;

import com.example.p7_1_11.base.BasePresenter;
import com.example.p7_1_11.contract.MainContract;
import com.example.p7_1_11.model.MainModelImpl;
import com.example.p7_1_11.model.UserBean;
import com.example.p7_1_11.utils.net.INetCallBack;

public class MainPresenterImpl extends BasePresenter implements MainContract.IMainPresenter {

    private final MainModelImpl mainModel1;
    private MainContract.IMainView mainView;

    public MainPresenterImpl(MainContract.IMainView mainView) {
        this.mainView = mainView;
        mainModel1 = new MainModelImpl(this);
    }

    @Override
    public void login() {
        mainModel1.getLoginData("%E7%A6%8F%E5%88%A9/10/5", new INetCallBack<UserBean>() {
            @Override
            public void onSuccess(UserBean userBean) {
                mainView.getData(userBean);
            }

            @Override
            public void onFail(String err) {

            }
        });
    }

    @Override
    public void loginResult(String result) {

    }
}
