package com.itheima05;

//Zi类继承Fu类 extends
public class Zi extends Fu {
    public void method(){
        System.out.println("Zi类中method()方法被调用");
    }

    public void show(){
        super.show();
        System.out.println("Zi类中的show()方法被调用");
    }
}
