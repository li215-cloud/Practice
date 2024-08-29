package com.itheima.test2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("输入字符串");
            str = sc.next();
            //检验字符串是否符合规则
            boolean flag = checkStr(str);
            if(flag){
                break;
            }else{
                System.out.println("当前字符串不符合规则，请重新输入");
                continue;
            }
        }

        //让数字跟数据一一对应
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < str.length(); i++){
            char c = str.charAt(i);
            int number = c - 48;
           String s = changeLuoMa(number);
           sb.append(s);
        }
        System.out.println(sb);
    }


    public static String changeLuoMa(int number){
        String[] arr = {"","一","二","三","四","五","六","七","八","九"};
        return arr[number];
    }


    public static boolean checkStr(String str){
        if(str.length() >9){
            return false;
        }

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c < '0' || c > '9'){
                return false;
            }
        }return true;
    }
}
