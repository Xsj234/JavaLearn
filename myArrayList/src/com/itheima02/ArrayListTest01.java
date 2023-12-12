package com.itheima02;

import java.util.ArrayList;

//遍历字符串
public class ArrayListTest01 {
    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<String>();

        array.add("a");
        array.add("b");
        array.add("c");

        for (String s : array) {
            System.out.println(s);
        }

/*        for (int i = 0;i<array.size();i++){
            String s = array.get(i);
            System.out.println(s);
        }*/

    }
}
