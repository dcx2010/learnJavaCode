
public class Demo02Variable{
	public static void main(String[] args){
		int num1;
		num1 = 10;
		System.out.println(num1);
		num1 = 20;
		System.out.println(num1);
		
		
		int num2 =30;
		System.out.println(num2);
		
		char ch1 = '中';
		System.out.println(ch1);
		
		boolean bl = true;
		System.out.println(bl);
		
		
		// 赋值不能超过作用域的范围使用
		{
			int num3 =20;
			System.out.println(num3);
						
		}
		//System.out.println(num3); 这行代码超出了作用域，无法使用
		
		char a = 'A';
		int result1 = a + 1;
		System.out.println(result1);
		
		System.out.println(true&&false);
		
		int d = 10;
		int e = 20;
		int max = d>e ? d:e;
		System.out.println("最大值是："+max);
		
	}
	
	
	
	
	
}