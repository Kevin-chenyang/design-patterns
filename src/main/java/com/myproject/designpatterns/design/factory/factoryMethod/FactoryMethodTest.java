package com.myproject.designpatterns.design.factory.factoryMethod;

import com.myproject.designpatterns.design.factory.simpleFactory.Phone;

/**
 * @program design-patterns
 * @description: 工厂方法模式测试类
 * @author: chenyang
 * @create: 2021/05/23 17:50
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        //使用苹果手机语音助手
        PhoneMethodFactory factory = new AppleFactory();
        Phone apple = factory.createPhone();
        apple.callVoiceAssistant();

        //使用华为手机语音助手
        PhoneMethodFactory factory2 = new AppleFactory();
        Phone huawei = factory.createPhone();
        huawei.callVoiceAssistant();

    }
}
