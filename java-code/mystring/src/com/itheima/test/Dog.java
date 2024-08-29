package com.itheima.test;

public class Dog extends Animal implements Swim{

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }


    @Override
    public void eat() {
        System.out.println("¹·ÔÚ³Ô¹ÇÍ·");
    }

    @Override
    public void swim() {
        System.out.println("¹·ÅÙ");
    }
}
