package com.umeng.soexample.mvpfeilei.view;

public interface IView<T> {
    void success(T success);
    void error(T error);
}
