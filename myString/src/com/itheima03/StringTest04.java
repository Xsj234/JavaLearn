package com.itheima03;

import java.util.Scanner;

public class StringTest04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String reverse = reverse(line);

        System.out.println(reverse);

    }
    public static String reverse(String s){
        String ss = "";

        for (int i = s.length()-1;i>=0;i--){
            ss+=s.charAt(i);
        }

        return ss;
    }
}
