package com.itheima_001;

import java.util.Scanner;

public class testDemo_if {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入星期几：");
        int week = input.nextInt();
        weekProject(week);
    }

    public static void weekProject(int week) {
        if (week == 1) {
            System.out.println("跑步");
        } else if (week == 2) {
            System.out.println("游泳");
        } else if (week == 3) {
            System.out.println("慢走");
        } else if (week == 4) {
            System.out.println("动感单车");
        } else if (week == 5) {
            System.out.println("拳击");
        } else if (week == 6) {
            System.out.println("爬山");
        } else if (week == 7) {
            System.out.println("好好吃一顿");
        } else {
            System.out.println("输入星期错误");
        }
    }
}
