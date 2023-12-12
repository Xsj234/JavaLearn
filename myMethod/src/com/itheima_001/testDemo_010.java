package com.itheima_001;

import java.util.Scanner;

public class testDemo_010 {
    public static void main(String[] args) {
        int[] arr = new int[6];
//        输入打分
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.print("请输入第"+(i+1)+"评委的打分:");
            int score = sc.nextInt();
            arr[i] = score;
        }
//      打分表展示
        arrayPrint(arr);

        int max = getMax(arr), min = getMin(arr);
        int sum = getSum(arr);

        System.out.println("max:"+max);
        System.out.println("min:"+min);
        System.out.println("sum:"+sum);
        int average = (sum-max-min)/4;
        System.out.println("average:"+average);
    }
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int j = 1; j < 6; j++) {
            if (arr[j]>max){
                max = arr[j];
            }
        }
        return max;
    }

    public static int getMin(int[] arr){
        int min = arr[0];
        for (int j = 1; j < 6; j++) {
            if (arr[j]<min){
                min = arr[j];
            }
        }
        return min;
    }

    public static int getSum(int[] arr){
        int sum = 0;
        for (int j = 0; j < 6; j++) {
            sum += arr[j];
        }
        return sum;
    }

    public static void arrayPrint(int[] arr){
        System.out.print("[");
        for (int j = 0; j < arr.length; j++) {
            if (j == arr.length - 1) {
                System.out.print(arr[j]);
            } else {
                System.out.print(arr[j] + ",");
            }
        }
        System.out.println("]");
    }

}
