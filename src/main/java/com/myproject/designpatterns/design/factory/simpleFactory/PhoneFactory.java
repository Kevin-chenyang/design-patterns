package com.myproject.designpatterns.design.factory.simpleFactory;

/**
 * @program design-patterns
 * @description:
 * @author: chenyang
 * @create: 2021/05/23 17:47
 */
public class PhoneFactory {

    private Phone phone;

    //工厂生产手机模具
    public Phone createPhone(String name){
        switch (name){
            case "apple":
                phone = new Huawei();
                break;
            case "huwei":
                phone = new Huawei();
                break;
            default:
                break;
        }
        return phone;
    }
}
