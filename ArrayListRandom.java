package learnJavaCode;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Random;

/*
题目：产生6个 1-33 的随机数，并放入集合中
思路：
1、产生6个随机数1-33的随机数：
2、添加到数组中；
*/


public class ArrayListRandom {
    public static void main(String[] args) {

        //创建一个数组

        ArrayList<Integer> list1 = new ArrayList<>();

        
        //产生6个随机数
        for (int i = 0; i < 6; i++) {
            //int a = new Random().nextInt(33) + 1 ; //产生了一个 [0,33]中整数随机数
            //list1.add(a);

            list1.add(new Random().nextInt(33)+1);
        }
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        
    

    }

}

