package com.myproject.designpatterns.design.factory.simpleFactory;

/**
 * @program design-patterns
 * @description: 简单工厂测试类
 * @author: chenyang
 * @create: 2021/05/23 17:50
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        //使用苹果手机语音助手
        PhoneFactory foxconnFactory = new PhoneFactory();
        Phone phone = foxconnFactory.createPhone("apple");
        phone.callVoiceAssistant();

    }
}
