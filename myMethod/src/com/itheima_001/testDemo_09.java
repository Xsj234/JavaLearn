package com.itheima_001;

//反转
public class testDemo_09 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
//        for (int i = 0; i < arr.length / 2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = temp;
//        }
        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        //增强型for循环
        System.out.print("[");
        for (int j = 0; j < arr.length; j++) {
            if (j == arr.length - 1) {
                System.out.print(arr[j]);
            } else {
                System.out.print(arr[j] + ",");
            }
        }
        System.out.print("]");
    }
}
