package com.itheima_001;
//比较两个数组是否相同
public class testDemo_07 {
    public static void main(String[] args) {
        int[] arr1 = {11,22,33,44};
        int[] arr2 = {11,22,33,22};
        boolean result = compareArr(arr1,arr2);
        System.out.println("结果: "+result);
    }

    public static boolean compareArr(int[] arr1,int[] arr2){
        if (arr1.length != arr2.length){
            return false;
        }
        for (int i=0;i< arr1.length;i++){
            if (arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
