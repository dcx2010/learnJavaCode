package learnJavaCode;
/*
题目：产生一个随机1-100的数字，并进行人工猜测
思路：
1、产生一个随机数；
2、循环输入猜的数字，每次输入后，提示是大了还是小了，还是正确了；
3、如果正确，程序结束，并返回恭喜你字样；

 */


import java.util.Random;
import java.util.Scanner;

public class NumberGuess2 {
    public static void main(String[] args) {
        int GuessNum = new Random().nextInt(100)+1;// 产生一个被猜测的随机整数【1,100】
        int InputNum;//用于存储输入的数字
        int i = 1;//记录输入次数


        while(true) {
            //先实现一次输入和提示判断
            System.out.println("第" + i + "次输入数字，请输入：");
            InputNum = new Scanner(System.in).nextInt();
            if (InputNum > GuessNum) {
                System.out.println("输入的数字大了！");
                System.out.println("===============================");
            } else if (InputNum < GuessNum) {
                System.out.println("输入的数字小了！");
                System.out.println("===============================");
            } else {
                System.out.println("恭喜你输入正确");
                break;
            }
            i++;
        }






    }



}
