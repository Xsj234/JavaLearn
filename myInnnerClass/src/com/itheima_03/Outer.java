package com.itheima_03;

public class Outer {
    private int num =10;

    public void method(){
        class Inner{
            public void show(){
                System.out.println(num);
            }
        }

        Inner i = new Inner();
        i.show();
    }

}
