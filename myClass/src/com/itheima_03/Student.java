package com.itheima_03;

public class Student {
    //成员变量

    private String name;
    private int age;

    /*public Student(){
        System.out.println("无参构造");
    }*/
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}
