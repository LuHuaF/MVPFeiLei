package com.umeng.soexample.mvpfeilei.presenter;


import com.umeng.soexample.mvpfeilei.callback.MyCallBack;
import com.umeng.soexample.mvpfeilei.model.MyModel;
import com.umeng.soexample.mvpfeilei.view.IView;

public class MyPresenter2 implements IPresenter {

    private MyModel myModel;
    private IView iView;

    public MyPresenter2(IView iView) {
        this.iView = iView;
        myModel = new MyModel();
    }

    @Override
    public void startRequest(String url, final int type) {
        myModel.getData(url, type, new MyCallBack() {
            @Override
            public void setSuccess(Object successData) {
                switch (type){
                    case 2:
                        iView.success(successData);
                }
            }

            @Override
            public void setError(Object errorData) {
                switch (type){
                    case 2:
                        iView.error(errorData);
                }
            }
        });
    }
}
