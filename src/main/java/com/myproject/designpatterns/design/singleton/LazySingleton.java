package com.myproject.designpatterns.design.singleton;

/**
 * @program design-patterns
 * @description: 懒汉模式
 * @author: chenyang
 * @create: 2021/05/23 15:53
 */
public class LazySingleton {

    private LazySingleton lazySingleton;

    private volatile LazySingleton lazySingleton2;

    private LazySingleton(){
    }

    /**
     * 线程不安全
     * @return
     */
    public LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    /**
     * 线程安全的懒汉
     * 这样的话锁的粒度比较大
     * @return
     */
    public synchronized LazySingleton getInstance2(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }


    /**
     * 线程安全的懒汉
     * 为了提高效率，可以让线程延时，但是还是可能会出现问题，
     * 如果第一次判断为空之后，拿到锁之后都会重新去new一个对象，这个可能会出现多个实例
     * @return
     */
    public LazySingleton getInstance3(){
        if(lazySingleton == null){
            synchronized(LazySingleton.class){
                lazySingleton = new LazySingleton();
            }
        }
        return lazySingleton;
    }

    /**
     * 加锁双层判断的方式
     * 这样的效率会高一些
     * @return
     */
    public LazySingleton getInstance4(){
        if(lazySingleton == null){
            synchronized(LazySingleton.class){
                if(lazySingleton ==null){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }

    public LazySingleton getInstance5(){
        if(lazySingleton2 == null){
            synchronized(LazySingleton.class){
                if(lazySingleton2 ==null){
                    lazySingleton2 = new LazySingleton();
                }
            }
        }
        return lazySingleton2;
    }


    private static class SingletonHolder{
        private static LazySingleton instance = new LazySingleton();
    }

    /**
     * 懒汉和饿汉结合的内部类方式创建
     */
    public static LazySingleton getInstance6(){
        return SingletonHolder.instance;
    }

}
