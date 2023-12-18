package com.itheima_02;

public class InterImpl extends Object implements Inter{
    @Override
    public void show() {
        System.out.println("show");
    }

    @Override
    public void method() {
        System.out.println("method");
    }

    public InterImpl() {
        super();
    }
}
