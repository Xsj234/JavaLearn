package com.itheima_02;

public class Outer {
    private int num = 10;
    private  class Inner{
        public void show(){
            System.out.println(num);
        }
    }

    public void method(){
        Inner i = new Inner();
        i.show();
    }
}
