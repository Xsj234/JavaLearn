package com.itheima01;

public class StringBuilderDemo01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("java");

        System.out.println(sb);

//        StringBuilder sb2 = new StringBuilder("java");
        StringBuilder sb2 = sb.append("nihao");
        System.out.println(sb);
        System.out.println(sb2);

        System.out.println(sb==sb2);
    }
}
