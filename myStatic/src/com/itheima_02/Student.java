package com.itheima_02;

public class Student {
    private String name = "ll";

    private static String university = "11";

    public void show1(){

    }

    public void show2(){
        System.out.println(name);
        System.out.println(university);
        show1();
        show3();
    }

    public static void show3(){

    }

    public static void show4(){
//        System.out.println(name);
        System.out.println(university);
//        show1();
        show3();
    }
}
