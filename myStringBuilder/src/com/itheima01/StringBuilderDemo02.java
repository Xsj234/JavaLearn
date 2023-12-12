package com.itheima01;

public class StringBuilderDemo02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello ").append("world ").append("java ").append(100);
        System.out.println(sb);

        sb.reverse();

        System.out.println(sb);


    }
}
