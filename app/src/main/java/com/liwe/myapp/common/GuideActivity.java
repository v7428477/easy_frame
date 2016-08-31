package com.liwe.myapp.common;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import com.liwe.myapp.R;
import com.liwe.myapp.base.BaseActivity;
import com.liwe.myapp.tools.ToolToast;

import butterknife.Bind;
import butterknife.OnClick;

public class GuideActivity extends BaseActivity {
    private String s;

    @Bind(R.id.mytext)
    TextView mytext;
    @OnClick(R.id.mytext) void show(){
        ToolToast.showShort(this,"chek me");
    }
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
        mytext.setText("check test ");

        System.out.println(s.equals("any string"));
    }

    @Override
    public void resume() {

    }

    @Override
    public void destroy() {

    }
}
