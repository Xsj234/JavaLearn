package com.itheim02;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("xsj");
        s.setAge(22);

        Student s2 = new Student();
        s2.setName("xsj");
        s2.setAge(22);

        System.out.println(s.equals(s2));

    }
}
