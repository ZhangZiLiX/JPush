package com.example.administrator.jpush.application;

import android.app.Application;

import java.util.HashSet;
import java.util.Set;

import cn.jpush.android.api.JPushInterface;

/**
 * Author : 张自力
 * Created on time.
 *
 * 全局配置
 *
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        initJPushs();

    }

    private void initJPushs() {
        //初始化sdk
        JPushInterface.setDebugMode(true);//正式版的时候设置false，关闭调试
        JPushInterface.init(this);

        //建议添加tag标签，发送消息的之后就可以指定tag标签来发送了
        Set<String> set = new HashSet<>();
        set.add("zzl");//名字任意，可多添加几个
        JPushInterface.setTags(this, set, null);//设置标签
    }
}
