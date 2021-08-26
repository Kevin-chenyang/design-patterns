package com.myproject.designpatterns.design.singleton;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @program design-patterns
 * @description: 饿汉模式
 * 只有在主动使用该类时才会触发初始化（访问静态方法或属性时或者new时）
 * 本质是借助jvm的类加载机制，在类初始化阶段就完成了初始化，保证了实例的唯一性
 * @author: chenyang
 * @create: 2021/05/23 16:14
 */
@Slf4j
public class HungrySingleton {

    private static HungrySingleton hungrySingleton= new HungrySingleton();

    private HungrySingleton(){
        //解决反射创建时创建多个实例
        if(hungrySingleton!=null){
            throw new RuntimeException("实例已经初始化完成，单例不允许创建多实例");
        }
    }

    public HungrySingleton getInstance(){
        return hungrySingleton;
    }

    /**
     * 通过反射创建饿汉模式就可能会导致初始化多个实例，可以在构造函数是增加校验来解决
     * @param args
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<HungrySingleton> declaredConstructor = HungrySingleton.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        HungrySingleton instance1 = declaredConstructor.newInstance();
        HungrySingleton instance2 = new HungrySingleton();
        log.info("result={}"+(instance1==instance2));
    }

}
