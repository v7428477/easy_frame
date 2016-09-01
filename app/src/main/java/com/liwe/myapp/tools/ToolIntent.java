package com.liwe.myapp.tools;

import android.content.Context;
import android.content.Intent;

/**
 * Date： 2016/9/1.
 * Created by： v7428477
 * email：764213580@qq.com
 */
public class ToolIntent {
    private static Intent intent =null;
    public static  void ClassToActivity(Context context,Class aClass){
        intent =new Intent();
        intent.setClass(context,aClass);
        context.startActivity(intent);
    }
}
