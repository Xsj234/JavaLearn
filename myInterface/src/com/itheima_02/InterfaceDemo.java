package com.itheima_02;

public class InterfaceDemo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
        i.show();
        i.method();
        System.out.println(Inter.num);
    }
}
