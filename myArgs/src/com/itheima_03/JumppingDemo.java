package com.itheima_03;

public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOperator jo = new JumppingOperator();
        jo.useJumpping(new Cat());

        Jumpping c = jo.getJumpping();
        c.jump();
    }
}
