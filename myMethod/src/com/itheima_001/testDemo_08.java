package com.itheima_001;

import java.util.Arrays;
import java.util.Scanner;

//查找
public class testDemo_08 {
    public static void main(String[] args) {
        int[] arr = {19,28,37,46,50};
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int index = getIndex(arr,number);
        System.out.println("index = " + index);
    }
    public static int getIndex(int[] arr,int number){
        int index = -1;
        for (int i =0;i<arr.length;i++){
            if (number == arr[i]){
                index = i;
                break;
            }
        }
        return index;
    }
}
