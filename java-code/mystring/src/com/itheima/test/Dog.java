package com.itheima.test;

public class Dog extends Animal implements Swim{

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }


    @Override
    public void eat() {
        System.out.println("���ڳԹ�ͷ");
    }

    @Override
    public void swim() {
        System.out.println("����");
    }
}
