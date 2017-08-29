package com.factoryMethod;/*
 *@Author: XueGaoMian
 *@Date: 2017/8/29 16:59
 *@Description:抽象工厂类
 * 优点：相比较静态工厂类而言，如果需要增加类  只需要增加具体的工厂类和具体类，
 * 不影响已有的代码
 * 缺点：
 * 需要额外的编写代码，增加工作量
 */

public class FactoryMethodTest {
    public static void main(String[] args) {
        Factory factory =new DogFactory();
        Dog dog= (Dog) factory.creatAnimal();
        Factory factory1= new CatFactory();
        Cat cat= (Cat) factory1.creatAnimal();
        dog.call();
        cat.call();
    }
}
