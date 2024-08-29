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
        //�û�����¼�����
    public static int[] userInputNumber(){
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 6;){
            System.out.println("�������" + (i+1)+"���������");
            int redNumber = sc.nextInt();
            if(redNumber >= 1 && redNumber <= 33){
                boolean flag = contains(arr,redNumber);
                if(!flag){
                    arr[i] = redNumber;
                    i++;
                }else{
                    System.out.println("��ǰ��ɫ�����Ѿ����ڣ�����������");
                }
            } else {
                System.out.println("��ǰ��ɫ���볬����Χ");
            }
        }

        //�û������������
        System.out.println("�������������");
        while (true) {
            int blueNumber = sc.nextInt();
            if(blueNumber >=1 && blueNumber <= 16){
                arr[arr.length -1] = blueNumber;
                break;
            }else{
                System.out.println("��ǰ������볬����Χ");
            }
        }
        return arr;
    }

    public static int[] createNumber(){
        int[] arr = new int[7];
        //����������ӵ�������
        Random r = new Random();
        for (int i = 0; i < 6;){
            //��ȡ��ɫ����
            int redNumber = r.nextInt(33)+1;
            boolean flag = contains(arr,redNumber);
            if(!flag){
                arr[i] = redNumber;
                i++;
            }
        }
        //�����������
        int blueNumber = r.nextInt(16)+1;
        arr[arr.length - 1] = blueNumber;
        return arr;
    }

    //�ж������Ƿ���������
    public static boolean contains(int[] arr,int number){
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == number){
                return true;
            }
        }
        return false;
    }
}
