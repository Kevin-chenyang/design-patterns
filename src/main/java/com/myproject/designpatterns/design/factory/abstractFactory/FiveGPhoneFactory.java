package com.myproject.designpatterns.design.factory.abstractFactory;

import com.myproject.designpatterns.design.factory.simpleFactory.Phone;

/**
 * @program design-patterns
 * @description:
 * @author: chenyang
 * @create: 2021/05/25 00:00
 */
public class FiveGPhoneFactory implements PhoneAbstractFactory{


    @Override
    public Phone createHuawei() {
        return null;
    }

    @Override
    public Phone createApple() {
        return null;
    }
}
