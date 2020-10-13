package learnJavaCode;

public class Student {

    //成员变量
    private String name;
    private int age;

    //构造方法1-无参数
    public Student(){

        System.out.println("我是无参数的构造方法");
    }


    //构造方法2-有参数
    public Student(String name,int age){
        System.out.println("我是有参数的构造方法");
        this.name = name;
        this.age = age;
    }

    //name 的setter getter
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }


    //age 的setter getter
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }









    //成员方法
    public void eat(){
        System.out.println("吃饭");

    }


}
