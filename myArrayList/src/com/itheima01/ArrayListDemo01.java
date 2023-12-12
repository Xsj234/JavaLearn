package com.itheima01;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        //构造ArrayList对象
        ArrayList<String> array = new ArrayList<String>();

        System.out.println(array.add("hello"));
        //添加元素
        array.add("world");
        array.add("java");
        //add可以接着下一位添加，不能跨越添加
        array.add(3,"100");
//        array.add(5,"a");

        System.out.println(array);
    }
}
