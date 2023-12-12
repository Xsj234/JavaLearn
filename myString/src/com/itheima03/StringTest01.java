package com.itheima03;

import java.util.Scanner;

public class StringTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        for (int i =0;i<line.length();i++){
            System.out.print(line.charAt(i));
        }
    }
}
