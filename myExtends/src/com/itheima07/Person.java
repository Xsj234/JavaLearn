package com.itheima07;

public class Person {
    private String name;
    private int age;

    public Person(String name,int age) {
        System.out.println("带参构造法");
    }
    public Person() {
        System.out.println("无参构造法");
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
}
