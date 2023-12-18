package com.itheima_03;
/*
    抽象类
*/
public abstract class Animal {

    private int age =10;
    private final String city = "北京";

    public Animal(){}

    public Animal(int age) {
        this.age = age;
    }

    //    抽象方法
    public abstract void eat();

    public void show(){
        System.out.println(age+city);
    }
}
