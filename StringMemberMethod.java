package learnJavaCode;

import java.util.SplittableRandom;

public class StringMemberMethod {
    public static void main(String[] args) {
        String str1 = "ajdlsajflsdjflka";
        String str2 = "ABC";

        //length 用法举例
        System.out.println(str1.length());

        // concat 用法举例
        String str3 = str1.concat(str2);
        System.out.println(str3);

        //charAt 用法举例
        System.out.println(str1.charAt(2));

        //indexOf 用法举例
        System.out.println(str1.indexOf('l'));

        System.out.println(str1.indexOf("lsa"));

        //substring 用法举例
        String str4 = "Hello,World";
        String str5 = str4.substring(3,6);
        System.out.println(str5);


        //toCharArray getBytes replace 用法举例、
        String str6 = "How do you do";
        char[] ch1 = str6.toCharArray();
        System.out.println(ch1);
        System.out.println(ch1[1]);

        byte[] by = str6.getBytes();
        System.out.println(by);
        System.out.println(by[1]);

        String str7 = str6.replace("o", "@");
        System.out.println(str7);





    }

}
