package com.myproject.designpatterns.design.factory.abstractFactory;

import com.myproject.designpatterns.design.factory.simpleFactory.Phone;

/**
 * @program design-patterns
 * @description:
 * @author: chenyang
 * @create: 2021/05/24 23:57
 */
public interface PhoneAbstractFactory {

    //创建华为手机
    public Phone createHuawei();

    //创建苹果手机
    public Phone createApple();

}
