package com.itheima_04;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat(10,"加菲");
        a.eat();
        System.out.println(a.getAge()+a.getName());

    }
}
