package learnJavaCode;

import java.util.Scanner;

public class Demo11ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        int a = sc.nextInt();

        System.out.println("请输入第二个数字：");
        int b = sc.nextInt();

        System.out.println("求和结果为" + (a+b));


    }


}
