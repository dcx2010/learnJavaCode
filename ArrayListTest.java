package learnJavaCode;
/*
题目：创建四个学生，存储到集合中，并进行遍历
思路：
1、创建学生类 public class
2、生成四个学生对象； new
3、创建一个集合 new
4、学生放到集合中 add
 */

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        // 第一种写法，思路清晰，代码较长
//        Student3 one = new Student3("叮当",1);
//        Student3 two = new Student3("蛋蛋",18);
//        Student3 three = new Student3("小白",3);
//        Student3 four = new Student3("小小丁",2);
//
//        ArrayList<Student3> StuList = new ArrayList<>();
//        StuList.add(one);
//        StuList.add(two);
//        StuList.add(three);
//        StuList.add(four);


// 第二种写法，代码短，逻辑复杂
        ArrayList<Student3> StuList = new ArrayList<>();
        StuList.add(new Student3("叮当",1));
        StuList.add(new Student3("蛋蛋",18));
        StuList.add(new Student3("小白",3));
        StuList.add(new Student3("小小丁",2));

        for (int i = 0; i < StuList.size(); i++) {
            System.out.println("第" + (i+1) +"号学生  " + "姓名：" + StuList.get(i).getName()+";年龄"+StuList.get(i).getAge());

        }





    }



}
