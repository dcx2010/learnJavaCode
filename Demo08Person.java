package learnJavaCode;

public class Demo08Person {

    String name;

    //设置age为私有类型
    private int age;

    //创建设置年龄，并进行年龄合理性判断的set方法
    public void setAge(int num){
        if(num<=100 && num>=9){
            age = num;
        }else{
            System.out.println("年龄范围输入有误");
        }

    }
    //创建年龄的获取方法
    public int getAge(){
        return age;

    }


    public void InfoPrint(){
        System.out.println("姓名"+name);
        System.out.println("年龄"+age);

    }


}
