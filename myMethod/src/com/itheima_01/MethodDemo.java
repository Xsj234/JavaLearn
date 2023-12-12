package com.itheima_01;
import java.util.Scanner;

public class MethodDemo {
    public static void main(String[] args) {
//        Scanner numberInput = new Scanner(System.in);
//        isEvenNumber(5);
        int maxNumber = getMax(5,12);
        System.out.println(maxNumber);
    }

    public static int getMax(int a,int b) {
        if(a>b){
            return a;
        }else {
            return b;
        }
    }
}