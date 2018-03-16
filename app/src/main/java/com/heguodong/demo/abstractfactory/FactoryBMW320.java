package com.heguodong.demo.abstractfactory;

import android.util.Log;

import static com.heguodong.demo.MainActivity.TAG;

/**
 * Created by 何国栋 on 2018/3/16.
 */

public class FactoryBMW320 implements AbstractFactory {
    @Override
    public Engine createEngine() {
        Log.d(TAG,"320 引擎开始制造。");
        return new Engine320();
    }

    @Override
    public Aircondition createAircondition() {
        Log.d(TAG,"320 空调开始制造。");
        return new Aircondition320();
    }
}
