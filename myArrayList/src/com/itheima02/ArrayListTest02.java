package com.itheima02;

import java.util.ArrayList;

//
public class ArrayListTest02 {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();

        Student s1 = new Student("林青霞",30);
        Student s2 = new Student("张曼玉",31);
        Student s3 = new Student("张三丰",50);

        array.add(s1);
        array.add(s2);
        array.add(s3);

        for (int i = 0;i<array.size();i++){
            Student s = array.get(i);
            System.out.println("name: "+s.getName()+"age: "+s.getAge());
        }

    }
}
