package com.itheima_05;

public class PingPangCoach extends Coach implements SpeakEnglish{
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }
}
