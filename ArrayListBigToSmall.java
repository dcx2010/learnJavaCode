package learnJavaCode;
/*
题目：随机产生一个20个元素的大集合，选取其中的偶数组成一个小集合
用方法实现

思路：
1、产生一个大集合：Random
2、定义一个小集合
3、对大集合进行遍历判断，并将偶数放入小集合
4、将第三步，编写成一个方法： public static ArrayList (ArrayList listBg){return listSm}

*/


import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.LinkedTransferQueue;

public class ArrayListBigToSmall {
    public static void main(String[] args) {
        // 创建用于放数据的大集合和小集合
        ArrayList<Integer> listBig = new ArrayList<>();
        ArrayList<Integer> listSmall = new ArrayList<>();

        //给大集合赋值
        for (int i = 0; i < 20; i++) {
            listBig.add(new Random().nextInt(100));
        }

        System.out.println(listBig);

        listSmall = getEvenNum(listBig);


        //实现偶数筛选
//        for (int i = 0; i < listBig.size(); i++) {
//            if(listBig.get(i)%2 == 0){
//                listSmall.add(listBig.get(i));
//            }
//
//        }

        //打印大小集合，进行验证
        System.out.println(listSmall);

    }


    // 定义筛选方法,输入 集合，输出 集合
    public static ArrayList<Integer> getEvenNum(ArrayList<Integer> listBg){
        System.out.println("集合筛选偶数方法被调用");
        ArrayList<Integer> listSm = new ArrayList<>();

        for (int i = 0; i < listBg.size(); i++) {

            if(listBg.get(i) % 2 == 0){
                listSm.add(listBg.get(i));
            }

        }


        return listSm;
    }

}
