package com.itheima_03;

public class MethodDemo {
    public static void main(String[] args) {
        System.out.println(compare(10,20));
        System.out.println(compare((byte)10,(byte)20));
        System.out.println(compare((short)10,(short)20));
        System.out.println(compare(10L,20L));


    }

    public static boolean compare(int a, int b){
        return a==b;
    }
    public static boolean compare(byte a,byte b){
        return a==b;
    }
    public static boolean compare(short a,short b){
        return a == b;
    }
    public static boolean compare(long a,long b){
        return a == b;
    }

}
