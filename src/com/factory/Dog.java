package com.factory;/*
 *@Author: XueGaoMian
 *@Date: 2017/8/29 16:25
 *@Description:实现公共接口的方法
 */

public class Dog implements Animal{
    @Override
    public void call() {
        System.out.println("汪汪汪。。。");
    }
}
