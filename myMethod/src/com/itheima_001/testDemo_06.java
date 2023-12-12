package com.itheima_001;
//元素求和,元素为偶数，元素个位和十位都不为7
public class testDemo_06 {
    public static void main(String[] args) {
        int[] arr = {68,27,95,88,171,996,51,210};
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2==0 && arr[i]%100/10!=7){
                sum +=arr[i];
            }
        }
        System.out.println(sum);
    }

}
