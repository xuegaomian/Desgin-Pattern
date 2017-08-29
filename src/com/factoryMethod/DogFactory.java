package com.factoryMethod;/*
 *@Author: XueGaoMian
 *@Date: 2017/8/29 16:57
 *@Description:具体的工厂类
 */

public class DogFactory implements Factory {


    @Override
    public Animal creatAnimal() {
        return new Dog();
    }
}
