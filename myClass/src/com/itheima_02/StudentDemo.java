package com.itheima_02;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "徐胜杰";
        s.setAge(20);

        System.out.println(s.name);
        System.out.println(s.getAge());
        s.study();

        s.doHomework();

    }
}
