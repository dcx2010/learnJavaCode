package learnJavaCode;

import java.util.SplittableRandom;

public class StringMemberMethod {
    public static void main(String[] args) {
        String str1 = "ajdlsajflsdjflka";
        String str2 = "ABC";

        System.out.println(str1.length());

        String str3 = str1.concat(str2);
        System.out.println(str3);

        System.out.println(str1.charAt(2));

        System.out.println(str1.indexOf('l'));

        System.out.println(str1.indexOf("lsa"));



    }

}
