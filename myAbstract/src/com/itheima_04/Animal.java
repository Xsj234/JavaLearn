package com.itheima_04;
/*
    抽象类
*/
public abstract class Animal {

    private int age;
    private String name;

    public Animal(){}

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    抽象方法
    public abstract void eat();


}
