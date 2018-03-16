package com.heguodong.demo.factorymethod;

import android.util.Log;

import com.heguodong.demo.BMW;

import static com.heguodong.demo.MainActivity.TAG;

/**
 * Created by 何国栋 on 2018/3/16.
 */

public class BMW523 extends BMW {

    public BMW523() {
        Log.d(TAG,"使用工厂方法模式 == > 制造了一台BMW523 ");
    }
}
