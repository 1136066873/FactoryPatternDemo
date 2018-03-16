package com.heguodong.demo.abstractfactory;

/**
 * Created by 何国栋 on 2018/3/16.
 */

public interface AbstractFactory {
    //制造发动机
    Engine createEngine();
    //制造空调
    Aircondition createAircondition();
}
