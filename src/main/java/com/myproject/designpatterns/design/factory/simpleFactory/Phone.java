package com.myproject.designpatterns.design.factory.simpleFactory;

import lombok.Data;

/**
 * @program design-patterns
 * @description: 虚拟的手机产品类
 * @author: chenyang
 * @create: 2021/05/23 17:47
 */
@Data
public abstract class Phone {

    private String name;

    //生产手机的抽象方法
    public abstract void callVoiceAssistant();
}
