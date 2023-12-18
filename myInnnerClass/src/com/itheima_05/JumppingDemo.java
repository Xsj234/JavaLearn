package com.itheima_05;

public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOperator jo = new JumppingOperator();
        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("猫跳高");
            }
        });
    }
}
