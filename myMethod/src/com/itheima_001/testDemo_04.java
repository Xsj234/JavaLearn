package com.itheima_001;

public class testDemo_04 {
    public static void main(String[] args) {
//        rabbitNum();
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;

        for (int x=2;x<arr.length;x++){
            arr[x] = arr[x-2] +arr[x-1];
        }
        System.out.println(arr[19]);

    }
    public static void rabbitNum(){
        int Rabbit3 = 0;
        int Rabbit2 = 0;
        int Rabbit1 = 1;
        int i =1;
        while (i<20){

            Rabbit3 = Rabbit3+Rabbit2;
            Rabbit2 = Rabbit1;
            Rabbit1 = Rabbit3;
            i++;
        }
        System.out.println(Rabbit3+Rabbit2+Rabbit1);
    }
}
