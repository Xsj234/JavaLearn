package com.itheima_05;

public class BasketballPlayer extends Player{

    @Override
    public void eat() {
        System.out.println("篮球运动员吃");
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习");
    }

    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }
}
