package com.itheima;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        //用输出语句完成主界面的编写
        ArrayList<Student> array = new ArrayList<>();
        while (true) {
            System.out.println("--------欢迎来到学生管理界面--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入您的选择：");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();


            switch (line) {
                case "1":
                    addStudent(array);
                    break;
                case "2":
                    deleteStudent(array);
                    break;
                case "3":
//                    System.out.println("修改学生");
                    updateStudent(array);
                    break;
                case "4":
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
//                    break;
                    System.exit(0);//JVM退出--
                default:
                    break;
            }
//            if (line.equals("5")){
//                System.out.println("谢谢使用");
//                break;
//            }
        }
    }

/*    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生学号：");
        String sid = sc.nextLine();
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();

        Student s = new Student();
        s.setSid(sid);
        s.setAge(age);
        s.setName(name);
        s.setAddress(address);

        array.add(s);

        System.out.println("添加学生成功");
    }*/
    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        String sid;

        //循环实现
        while(true){
            System.out.println("请输入学生学号：");
            sid = sc.nextLine();

            boolean flag = isUsed(array, sid);
            if (flag){
                System.out.println("你输入的学号已经被使用，请重新输入");
            } else {
                break;
            }
        }

        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();

        Student s = new Student();
        s.setSid(sid);
        s.setAge(age);
        s.setName(name);
        s.setAddress(address);

        array.add(s);

        System.out.println("添加学生成功");
    }

    //定义一个方法，判断学号是否被使用
    public static boolean isUsed(ArrayList<Student> array,String sid){
        boolean flag = false;
        for (int i =0;i<array.size();i++){
            Student s = array.get(i);
            if (s.getSid().equals(sid)){
                flag = true;
                break;
            }
        }

        return flag;
    }
    //定义一个方法，用于查看学生信息
    public static void findAllStudent(ArrayList<Student> array) {
        //判断Arraylist有无信息
        if (array.size() == 0) {
            System.out.println("无信息，请先添加信息再查询");
            //为了程序不再向下执行
            return;
        }
        //"\t"是Tab键的位置
        System.out.println("学号\t姓名\t年龄\t地址");
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress());
        }
    }

    public static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要删除学生的学号");
        String sid = sc.nextLine();
        int index = -1;

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("该信息不存在，请重新输入");
        }else {
            array.remove(index);
            System.out.println("删除学生成功");
        }
    }

    //定义一个方法修改学生信息
    public static void updateStudent(ArrayList<Student> array) {
        //键盘录入要修改的学生学号，显示提示信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要修改学生的学号");
        String sid = sc.nextLine();

        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getSid().equals(sid)) {
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("该信息不存在，请重新输入");
        }else {
            //键盘录入要修改的学生信息
            System.out.println("姓名");
            String name = sc.nextLine();
            System.out.println("年龄");
            String age = sc.nextLine();
            System.out.println("地址");
            String address = sc.nextLine();
            //创建学生对象
            Student s = new Student();
            s.setSid(sid);
            s.setName(name);
            s.setAge(age);
            s.setAddress(address);
            array.set(index, s);
            System.out.println("修改信息成功");
        }
    }
 

}


























