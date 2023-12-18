package com.itheima_05;

public class BasketballCoach extends Coach{
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃");
    }
}
