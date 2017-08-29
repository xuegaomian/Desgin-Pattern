package com.factory;/*
 *@Author: XueGaoMian
 *@Date: 2017/8/29 16:30
 *@Description:静态工厂
 *
 * 将需要的类型传入工厂类，由工厂类来创建对象
 * 优点：客户端不需要自己创建对象，明确了各类的职责
 * 缺点：如果有新的对象加入，就需要改动工厂类的代码，不利于后期的维护
 */

public class FactoryTest {
    public static void main(String[] args) {
        AnimalFactory factory=new AnimalFactory();
        Animal cat=factory.produce("cat");
        Animal dog=factory.produce("dog");
        cat.call();
        dog.call();
        Animal dog1=factory.produce("dogg");
    }
}
