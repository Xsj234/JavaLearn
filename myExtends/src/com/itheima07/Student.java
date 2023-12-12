package com.itheima07;

public class Student extends Person{

    private double score;

    public Student(){
        super();
        System.out.println("子类无参");
    }

    public Student(double score){
        super("xsj",15);
        this.score = score;
        System.out.println("子类有参");
    }

}
