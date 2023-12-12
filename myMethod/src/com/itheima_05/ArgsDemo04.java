package com.itheima_05;

public class ArgsDemo04 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,6};
        int max = maxArray(arr);
        System.out.println(max);
    }
    public static int maxArray(int[] arr){
        int max = arr[0];
        for (int i =1;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
