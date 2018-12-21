package com.umeng.soexample.mvpfeilei.model;


import com.umeng.soexample.mvpfeilei.callback.MyCallBack;

public interface IModel {
    void getData(String url, int type, MyCallBack myCallBack);
}
