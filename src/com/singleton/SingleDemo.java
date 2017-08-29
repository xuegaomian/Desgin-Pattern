package com.singleton;/*
 *@Author: XueGaoMian
 *@Date: 2017/8/29 16:12
 *@Description:
 */

public class SingleDemo {
    public static void main(String[] args) {
        //饿汉式
        SingletonA singletonA1 = SingletonA.getSingleton();
        SingletonA singletonA2 = SingletonA.getSingleton();
        //返回结果为true，说明两次得到的是同一个对象；
        System.out.println(singletonA1 == singletonA2);
        //懒汉式
        SingletonB singletonB1=SingletonB.getSingleton();
        SingletonB singletonB2=SingletonB.getSingleton();
        //返回结果为true，说明两次得到的是同一个对象；
        System.out.println(singletonB1==singletonB2);
    }
}
