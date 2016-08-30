package com.liwe.myapp;

import android.app.Application;
import android.content.Context;

/**
 * Date： 2016/8/30.
 * Created by： v7428477
 * email：764213580@qq.com
 */
public class MApplication extends Application {
    /** 对外提供整个应用生命周期的Context **/
    private static Context instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    /**
     * 对外提供Application Context
     *
     * @return
     */
    public static Context gainContext() {
        return instance;
    }


}
