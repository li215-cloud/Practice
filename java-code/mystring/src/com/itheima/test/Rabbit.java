package com.itheima.test;

public class Rabbit extends Animal{

    public Rabbit() {
    }



    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("ÍÃ×ÓÔÚ³ÔºúÂÜ²·");
    }
}
