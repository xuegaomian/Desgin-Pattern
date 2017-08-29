package com.factory;/*
 *@Author: XueGaoMian
 *@Date: 2017/8/29 16:26
 *@Description:
 */

public class AnimalFactory {
    public Animal produce(String type){
        if ("cat".equals((type))){
            return new Cat();
        }else if("dog".equals(type)){
            return new Dog();
        }else {
            System.out.println("类型错误，不能创建该类型的对象");
            return null;
        }
    }
}
