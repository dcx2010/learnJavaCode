package learnJavaCode;

public class Demo09person {
    public static void main(String[] args) {

        Demo08Person person = new Demo08Person();
        //person.age =20;
        person.setAge(20);
        person.setAge(-20);

        person.name ="小蛋蛋";
        person.InfoPrint();


    }



}
