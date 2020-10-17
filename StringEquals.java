package learnJavaCode;

public class StringEquals {
    public static void main(String[] args) {
        String a = "abc";
        String b = "Abc";
        char[] d = {'a','b','c'};

        String c = new String(d);

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

        System.out.println(a==c);



    }



}
