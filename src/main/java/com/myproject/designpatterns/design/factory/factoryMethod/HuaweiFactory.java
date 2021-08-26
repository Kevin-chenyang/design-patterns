package com.myproject.designpatterns.design.factory.factoryMethod;

import com.myproject.designpatterns.design.factory.simpleFactory.Huawei;
import com.myproject.designpatterns.design.factory.simpleFactory.Phone;

/**
 * @program design-patterns
 * @description: 华为工厂
 * @author: chenyang
 * @create: 2021/05/23 22:53
 */
public class HuaweiFactory implements PhoneMethodFactory {
    @Override
    public Phone createPhone() {
        return new Huawei();
    }
}
