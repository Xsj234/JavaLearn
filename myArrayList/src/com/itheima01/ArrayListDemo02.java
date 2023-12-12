package com.itheima01;

import java.util.ArrayList;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();

        array.add("Hello");
        array.add("World");
        array.add("Java");

        //remove(元素)返回boolean类型
        System.out.println(array.remove("Hello"));
        //remove(索引)返回删除的元素
        System.out.println(array.remove(1));
        //set(索引,修改元素)返回被修改的元素
        System.out.println(array.set(0,"aa"));//返回World
        //get(索引)返回指定索引的元素
        System.out.println(array.get(0));
        //size()返回ArrayList元素个数
        System.out.println(array.size());

        System.out.println("array: " + array);


    }
}
