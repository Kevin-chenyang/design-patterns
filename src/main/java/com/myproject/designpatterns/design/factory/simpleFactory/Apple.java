package com.myproject.designpatterns.design.factory.simpleFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @program design-patterns
 * @description: 苹果手机
 * @author: chenyang
 * @create: 2021/05/23 17:49
 */
@Slf4j
public class Apple extends Phone{

    //苹果手机生产的具体方法
    @Override
    public void callVoiceAssistant(){
        log.info("苹果语音助手siri为你服务");
    }
}
