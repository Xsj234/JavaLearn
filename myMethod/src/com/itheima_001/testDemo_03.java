package com.itheima_001;

public class testDemo_03 {
    public static void main(String[] args) {
        gameFor();
    }

    public static void gameFor(){
        for (int i=1;i<=100;i++){
            if(i%7==0 || i%10==7 || i/10==7){
                System.out.println(i);
            }
        }
    }
    public static void gameWhile(){
        int i = 1;
        while (i<=100){
            if(i%7==0 || i%10==7 || i/10==7){
                System.out.println(i);
            }
            i++;
        }
    }
}
