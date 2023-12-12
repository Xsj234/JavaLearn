package com.itheima_05;

public class ArgsDemo3 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        printArray(arr);
    }

    public static void printArray(int[] arr){
        System.out.print('[');
        System.out.print(arr[0]);
        for(int i =1;i<arr.length;i++){
            System.out.print(","+arr[i]);
        }
        System.out.print(']');
    }
}

