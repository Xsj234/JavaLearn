package com.itheima_01;

public class Outer {
    private int num = 10;
    public class Inner{
        public void show(){
            System.out.println(num);
        }
    }

//    show();
    Inner i = new Inner();
    public void method(){
        i.show();
    }

}

