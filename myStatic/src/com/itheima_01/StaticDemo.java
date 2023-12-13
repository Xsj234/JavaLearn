package com.itheima_01;

public class StaticDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "林青霞";
        s1.age = 30;
//        通过类引用访问static修饰的university
        Student.university = "北京大学";

        s1.show();

        Student s2 = new Student();
        s2.name = "风清扬";
        s2.age = 33;
//        s2.university = "北京大学";
        s2.show();
    }
}
