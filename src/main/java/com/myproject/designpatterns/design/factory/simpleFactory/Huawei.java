package com.myproject.designpatterns.design.factory.simpleFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @program design-patterns
 * @description: 华为手机
 * @author: chenyang
 * @create: 2021/05/23 17:49
 */
@Slf4j
public class Huawei extends Phone{

    //华为手机生产的具体方法
    @Override
    public void callVoiceAssistant(){
        log.info("华为语音助手小艺为你服务");
    }
}
