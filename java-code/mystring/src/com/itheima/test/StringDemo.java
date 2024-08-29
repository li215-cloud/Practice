package com.itheima.test;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        String rightUsername = "ll";
        String rightPassword = "123456";


        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String username = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();


            if (username.equals(rightUsername) && password.equals(rightPassword)) {
                System.out.println("登录成功");
                break;
            } else {
                if (i == 2) {
                    System.out.println("账号" + username + "被锁定，请联系管理员");
                } else {
                    System.out.println("登录失败，用户名与密码错误，你还剩下" + (2 - i) + "次机会");
                }
            }
        }
    }
}

