package com.itheima.test2;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = createNumber();
        int[] userInputArr = userInputNumber();
        for (int i = 0; i < userInputArr.length; i++) {
            System.out.println(userInputArr[i] + " ");
        }

    }
        //用户键盘录入号码
    public static int[] userInputNumber(){
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 6;){
            System.out.println("请输入第" + (i+1)+"个红球号码");
            int redNumber = sc.nextInt();
            if(redNumber >= 1 && redNumber <= 33){
                boolean flag = contains(arr,redNumber);
                if(!flag){
                    arr[i] = redNumber;
                    i++;
                }else{
                    System.out.println("当前红色号码已经存在，请重新输入");
                }
            } else {
                System.out.println("当前红色号码超出范围");
            }
        }

        //用户输入蓝球号码
        System.out.println("请输入蓝球号码");
        while (true) {
            int blueNumber = sc.nextInt();
            if(blueNumber >=1 && blueNumber <= 16){
                arr[arr.length -1] = blueNumber;
                break;
            }else{
                System.out.println("当前蓝球号码超出范围");
            }
        }
        return arr;
    }

    public static int[] createNumber(){
        int[] arr = new int[7];
        //生成数字添加到数组中
        Random r = new Random();
        for (int i = 0; i < 6;){
            //获取红色号码
            int redNumber = r.nextInt(33)+1;
            boolean flag = contains(arr,redNumber);
            if(!flag){
                arr[i] = redNumber;
                i++;
            }
        }
        //生成蓝球号码
        int blueNumber = r.nextInt(16)+1;
        arr[arr.length - 1] = blueNumber;
        return arr;
    }

    //判断数字是否在数组中
    public static boolean contains(int[] arr,int number){
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == number){
                return true;
            }
        }
        return false;
    }
}
