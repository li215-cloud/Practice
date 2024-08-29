package com.itheima.test;

public class GirlFriend {
    private String name;
    private int age;
    private String gender;
    //name
    public void setName(String name){
       this.name = name;
    }
    public String getName(){
        return name;
    }

    //age
    public void setAge(int age){
        if(age >= 18 && age <= 35){
            this.age = age;
        }else{
            System.out.println("非法参数");
        }
    }
    public int getAge(){
        return age;
    }

    //gender
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
}
