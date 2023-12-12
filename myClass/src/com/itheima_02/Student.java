package com.itheima_02;

public class Student {
    String name;
    private int age;

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            System.out.println("年龄有误");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void study() {
        System.out.println("学习");
    }

    public void doHomework() {
        System.out.println("做作业");
    }

}
