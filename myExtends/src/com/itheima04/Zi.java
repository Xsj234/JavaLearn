package com.itheima04;

//Zi类继承Fu类 extends
public class Zi extends Fu {
    public Zi(){
        super(40);
        System.out.println("Zi无参构造方法");
    }

    public Zi(int age){
        super(40);
//        super();
        System.out.println("Zi带参构造方法");
    }
}
