package com.singleton;/*
 *@Author: XueGaoMian
 *@Date: 2017/8/29 16:08
 *@Description:饿汉式单例模式
 */

/*
 *@Author:XueGaoMian
 *@Date:2017/8/29 16:10
 *@MethordDescription:饿汉式
 * 1、私有化构造
 * 2、创建私有并静态的本类对象
 * 3、定义功夫有的静态方法，返回该对象
 */
public class SingletonA {
    private SingletonA(){}
    //类创建时实例化一个该类的对象
    private static SingletonA s=new SingletonA();
    public static SingletonA getSingleton(){
        return s;
    }
}
