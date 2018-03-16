package com.heguodong.demo.factorymethod;

import android.util.Log;
import com.heguodong.demo.BMW;
import com.heguodong.demo.Factory;

import static com.heguodong.demo.MainActivity.TAG;

/**
 * Created by 何国栋 on 2018/3/16.
 * 工厂方法模式作为救世主出现了。 工厂类定义成了接口,
 * 而每新增的车种类型,就增加该车种类型对应工厂类的实
 * 现,这样工厂的设计就可以扩展了,而不必去修改原来的代码。
 */

public class BMW523factory implements Factory {

    public BMW523factory() {
        Log.d(TAG,"制造 BMW523 的工厂开始工作");
    }


    @Override
    public BMW creatBMW() {
        BMW523 bmw320 = new BMW523();
        Log.d(TAG,"523 制造完成");
        return bmw320;
    }
}
