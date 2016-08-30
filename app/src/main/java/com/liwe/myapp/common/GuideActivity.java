package com.liwe.myapp.common;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import com.liwe.myapp.R;
import com.liwe.myapp.base.BaseActivity;

import butterknife.Bind;

public class GuideActivity extends BaseActivity {
    @Bind(R.id.mytext)   TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public int bindLayout() {
        return R.layout.activity_main;
    }


    @Override
    public void doBusiness(Context mContext) {
        textView.setText("123123123");
    }

    @Override
    public void resume() {

    }

    @Override
    public void destroy() {

    }
}
