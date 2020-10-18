package learnJavaCode;

import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        //输入一个字符串
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串");
        String input = sc.next();

        //定义计数变量
        int countUpper = 0;
        int countLower = 0;
        int countNum = 0;
        int countOther = 0;

        //字符串转为字符型数组，便于单个字符取出，遍历； 也可以用指针取出
        char[] charArray = input.toCharArray();

        //遍历数组，并进行判断
        //注意：字符底层是数字，因此字符键可以改用<>=等进行比较，得到布尔值
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if(ch<='Z'&& ch>='A'){
                countUpper++;
            }else if(ch<='z'&& ch>='a'){
                countLower++;
            }else if (ch<='9' && ch>= '0'){
                countNum++;
            }else{
                countOther++;
            }


        }

        System.out.println("大写字母个数："+countUpper);
        System.out.println("小写字母个数："+countLower);
        System.out.println("数字字符个数："+countNum);
        System.out.println("其他字符个数："+countOther);

    }
}
