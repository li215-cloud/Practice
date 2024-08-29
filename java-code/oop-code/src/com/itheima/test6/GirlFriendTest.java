package com.itheima.test6;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend[] arr = new GirlFriend[4];

        GirlFriend gf1 = new GirlFriend("李", 28, "萌", "学习");
        GirlFriend gf2 = new GirlFriend("谢", 22, "萌", "玩");
        GirlFriend gf3 = new GirlFriend("谢", 25, "萌", "看书");
        GirlFriend gf4 = new GirlFriend("李", 25, "萌", "看书");

        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;


        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            sum = sum + gf.getAge();
        }
        int avg = sum / arr.length;

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            if (gf.getAge() < avg) {
                count++;
                System.out.println(gf.getName() + "," + gf.getAge() + "," + gf.getGender() + "," + gf.getHobby());
            }
        }
        System.out.println(count + "个");
    }
}


