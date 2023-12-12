package com.itheima03;

//Zi类继承Fu类 extends
public class Zi extends Fu {
    public int age =20;

    public void show(){
        int age = 30;
        System.out.println(age);
        System.out.println(this.age);
//        输出访问父类成员变量
        System.out.println(super.age);
    }
}
