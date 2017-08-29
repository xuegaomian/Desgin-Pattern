package com.factory;/*
 *@Author: XueGaoMian
 *@Date: 2017/8/29 16:24
 *@Description:实现公共接口的方法
 */

public class Cat implements Animal{
    @Override
    public void call() {
        System.out.println("喵喵喵。。。");
    }
}
