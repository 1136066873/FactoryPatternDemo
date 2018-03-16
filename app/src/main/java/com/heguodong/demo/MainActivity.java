package com.heguodong.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.heguodong.demo.abstractfactory.FactoryBMW320;
import com.heguodong.demo.abstractfactory.FactoryBMW523;
import com.heguodong.demo.factorymethod.BMW320factory;
import com.heguodong.demo.factorymethod.BMW523factory;
import com.heguodong.demo.simplefactory.BMWfactorysimple;

/**
 *http://blog.csdn.net/jason0539/article/details/23020989
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static String TAG = "heguodong";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv_1).setOnClickListener(this);
        findViewById(R.id.tv_2).setOnClickListener(this);
        findViewById(R.id.tv_3).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_1 :
                Log.d(TAG,"使用简单工厂模式造车。(我想要一台BMW523)");//在投影音响项目中鹏飞使用过
                //开始造车
                BMWSimpleFactoryWork(523);


                break;
            case R.id.tv_2 :
                Log.d(TAG,"使用工厂方法模式造车。");
                BMWFactoryMethodWork();

                break;
            case R.id.tv_3 :
                Log.d(TAG,"使用抽象工厂模式造车。");
                BMWAbstractFactoryWork();






                break;
        }
    }

    private void BMWAbstractFactoryWork() {
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        factoryBMW320.createEngine();
        factoryBMW320.createAircondition();

        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
        factoryBMW523.createEngine();
        factoryBMW523.createAircondition();


    }

    private void BMWFactoryMethodWork() {
        BMW320factory bmw320factory = new BMW320factory();
        bmw320factory.creatBMW();

        BMW523factory bmw523factory = new BMW523factory();
        bmw523factory.creatBMW();
    }

    private void BMWSimpleFactoryWork(int i) {
        BMWfactorysimple bmWfactorysimple = new BMWfactorysimple();
        bmWfactorysimple.creatBMW(i);
    }

}
