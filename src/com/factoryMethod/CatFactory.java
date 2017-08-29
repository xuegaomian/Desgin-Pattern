package com.factoryMethod;/*
 *@Author: XueGaoMian
 *@Date: 2017/8/29 17:03
 *@Description:
 */

public class CatFactory implements Factory {
    @Override
    public Animal creatAnimal() {
        return new Cat();
    }
}
