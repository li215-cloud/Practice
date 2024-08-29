package com.itheima.test3;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];

        Goods g1 = new Goods("001","华为",6000,100);
        Goods g2 = new Goods("002","保温杯",50,20);
        Goods g3 = new Goods("003","茶",1000,50);

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for(int i = 0;i < arr.length; i++){
            Goods goods = arr[i];
            System.out.println(goods.getId() + "," + goods.getName() + "," +
                    goods.getPrice() + "," + goods.getCount());
        }
    }
}
