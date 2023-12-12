package com.itheima02;

import java.util.Scanner;

public class StringBuilderTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        String s = myReverse(line);
        System.out.println("s:"+s);

    }

    public static String myReverse(String s){
        return new StringBuilder(s).reverse().toString();
    }
}
