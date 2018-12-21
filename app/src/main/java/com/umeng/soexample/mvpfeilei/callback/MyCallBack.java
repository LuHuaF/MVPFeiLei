package com.umeng.soexample.mvpfeilei.callback;

public interface MyCallBack<T> {
    void setSuccess(T successData);
    void setError(T errorData);
}
