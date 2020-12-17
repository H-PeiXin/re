package com.example.p7_1_11.view;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.p7_1_11.R;
import com.example.p7_1_11.adapter.RecAdapter;
import com.example.p7_1_11.base.BaseActivity;
import com.example.p7_1_11.contract.MainContract.IMainView;
import com.example.p7_1_11.model.UserBean;
import com.example.p7_1_11.presenter.MainPresenterImpl;

import java.util.ArrayList;

public class MainActivity extends BaseActivity<MainPresenterImpl> implements IMainView {

    private RecyclerView rec_main;

    @Override
    protected void initData() {
        rec_main.setLayoutManager(new LinearLayoutManager(this));

        presenter.login();
    }

    @Override
    protected void initView() {
        rec_main = findViewById(R.id.rec_main);
    }

    @Override
    public MainPresenterImpl add() {
        return new MainPresenterImpl(this);
    }

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    public void getData(UserBean string) {
        ArrayList<UserBean.ResultsBean> results = (ArrayList<UserBean.ResultsBean>) string.getResults();
        RecAdapter recAdapter = new RecAdapter(results, this);
        rec_main.setAdapter(recAdapter);
    }
}