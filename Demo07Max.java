package learnJavaCode;

public class Demo07Max {

    public static void main(String[] args) {
        int[] num = {1,3,5,9,21,34,23,3,6,7};
        int max = GetMax(num);
        System.out.println(max);


    }


    //定义一个方法，实现求解int 数据中最大值
    public static int GetMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

}
