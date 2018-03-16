package com.heguodong.demo.simplefactory;

import android.util.Log;
import com.heguodong.demo.BMW;
import com.heguodong.demo.factorymethod.BMW320;
import com.heguodong.demo.factorymethod.BMW523;
import static com.heguodong.demo.MainActivity.TAG;

/**
 * Created by 何国栋 on 2018/3/16.
 *
 * 从开闭原则（对扩展开放；对修改封闭）上来分析简单工厂模式：当客户
 * 不再满足现有的车型号的时候，想要一种速度快的新型车，只要这种车符合
 * 抽象产品制定的合同，那么只要通知工厂类知道就可以被客户使用了。所以
 * 对产品部分来说，它是符合开闭原则的；但是工厂部分好像不太理想，因为
 * 每增加一种新型车，都要在工厂类中增加相应的创建业务逻辑
 * （createBMW(int type)方法需要新增case），这显然是违背开闭原则的。
 */

public class BMWfactorysimple{

    public BMWfactorysimple() {
        Log.d(TAG,"简单工厂开始启动对应产线 ");
    }

    public BMW creatBMW(int i) {
        switch (i){
            case 320 :
                BMW320 bmw320 = new BMW320();
                Log.d(TAG,"320 产线造完了。");
                return bmw320;

            case 523 :
                BMW523 BMW523 = new BMW523();
                Log.d(TAG,"523 产线造完了。");
                return BMW523;

            default:
                Log.d(TAG,"参数出错了，造毛线。");
                return null;

        }
    }
}
