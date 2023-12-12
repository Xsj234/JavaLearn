package com.itheima_001;

public class testDemo_05 {
    public static void main(String[] args) {
//        循环嵌套
        for(int x = 0;x<=20;x++){
            for (int y = 0;y<=33;y++){
                int z= 100-x-y;
                if (5*x+3*y+z/3.0==100){
                    System.out.println(x+","+y+","+z);
                }
            }
        }

    }
}
