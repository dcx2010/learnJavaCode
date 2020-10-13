package learnJavaCode;

public class Student2 {
    private String name;
    private int age;


    //自动生成的构造方法
    public Student2() {
    }

    //自动生成的构造方法
    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //name 的 Setter Getter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    //age 的 Setter Getter
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
