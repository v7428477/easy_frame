package com.liwe.myapp.base;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Date： 2016/8/30.
 * Created by： v7428477
 * email：764213580@qq.com
 */
public abstract class BaseActivity  extends Activity implements  IBaseActivity {
private View mContextView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //设置渲染视图view
        mContextView = LayoutInflater.from(this).inflate(bindLayout(),null);
        setContentView(mContextView);

        //初始化控件
        initView(mContextView);

        //业务操作
        doBusiness(this);

    }


    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        resume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        destroy();
    }


}
