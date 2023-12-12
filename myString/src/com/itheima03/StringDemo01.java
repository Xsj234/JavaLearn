package com.itheima03;
import java.util.Scanner;

//用户登录
public class StringDemo01 {
    public static void main(String[] args) {

        String username = "adim";
        String password = "123456";
        Scanner sc = new Scanner(System.in);

        for(int i = 0;i<3;i++){
            System.out.println("账号");
            String name = sc.nextLine();
            System.out.println("密码");
            String pwd = sc.nextLine();
            if (name.equals(username) && pwd.equals(password)){
                System.out.println("登陆成功");
                break;
            }else {
                if(i-2 == 0){
                    System.out.println("账户已锁定，请与管理员联系");
                }else {
                    System.out.println("登录失败，您还剩"+(2-i)+"机会");
                }
            }
        }

    }
}
