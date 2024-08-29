package com.itheima.test4;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("ll",25,"男");
        Student stu2 = new Student("ly",26,"男");
        Student stu3 = new Student("hu",25,"男");


        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        int maxAgeStudent = StudentUtil.getMaxAgeStudent(list);

        System.out.println(maxAgeStudent);
    }
}
