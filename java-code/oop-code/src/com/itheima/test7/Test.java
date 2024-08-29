package com.itheima.test7;

public class Test {
    public static void main(String[] args) {

        Student[] arr = new Student[3];

        Student stu1 = new Student(1, "xnsdi", 23);
        Student stu2 = new Student(2, "dsei", 25);
        Student stu3 = new Student(3, "odsi", 26);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        Student stu4 = new Student(4, "iwye", 20);

        boolean flag = contains(arr, stu4.getId());
        if (flag) {
            System.out.println("id重复，请重新输入");
        } else {
            int count = getCount(arr);
            if (count == arr.length) {
                Student[] newArr = creatNewArr(arr);
                newArr[count] = stu4;//已经满了
            } else {
                arr[count] = stu4;
            }
        }


        public static void printArr(Student[] arr){
            for (int i = 0; i < arr.length; i++) {
                Student stu = arr[i];
                if (arr[i] != null) {
                    System.out.println(stu.getId() + "，" + stu.getName()+"，" + stu.getAge());
                }
            }
        }


        public static void creatNewArr(Student[] arr){
            Student[] newArr = new Student[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            return newArr;
        }


        public static int getCount(Student[]arr){
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != null) {
                    count++;
                }
            }
        }


        public static boolean contains(Student[] arr,int id){
            for (int i = 0; i < arr.length; i++) {
                Student stu = arr[i];
                int sid = stu.getId();
                if (sid == id) {
                    return true;
                }
            }
            return false;
        }
    }
}