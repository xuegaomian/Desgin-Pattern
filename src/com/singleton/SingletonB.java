package com.singleton;/*
 *@Author: XueGaoMian
 *@Date: 2017/8/29 16:15
 *@Description:懒汉式  延迟加载调用静态公共方法时才创建该类的对象
 */

public class SingletonB {
    private SingletonB(){}
    private static SingletonB singletonB=null;
    public static SingletonB getSingleton(){
        if (singletonB==null){
            singletonB=new SingletonB();
        }
        return singletonB;
    }
}
