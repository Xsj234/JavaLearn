package com.itheima_01;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void eat() {
                System.out.println("你好");
            }
        };
        a.eat();
    }
}
