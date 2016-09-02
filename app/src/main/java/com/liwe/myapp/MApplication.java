package com.liwe.myapp;

import android.app.Application;
import android.content.Context;

import com.baidu.mapapi.SDKInitializer;

/**
 * 增加android 全局异常捕获弹出提示退出应用，收集错误信息
 * Date： 2016/8/30.
 * Created by： v7428477
 * email：764213580@qq.com
 */
public class MApplication extends Application {//Application：用来管理应用程序的全局状态。在应用程序启动时Application会首先创建，然后才会根据情况(Intent)来启动相应的Activity和Service。本示例中将在自定义加强版的Application中注册未捕获异常处理器。
    /** 对外提供整个应用生命周期的Context **/
    private static Context instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
//        CrashHandler crashHandler = CrashHandler.getInstance();
//        crashHandler.init(instance);

        //在使用SDK各组件之前初始化context信息，传入ApplicationContext
        //注意该方法要再setContentView方法之前实现
        SDKInitializer.initialize(getApplicationContext());
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
