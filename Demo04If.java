
public class Demo04If{
	public static void main(String[] args){
		
		
		int a = 88;
		if (a>100 || a<1){
			System.out.println("成绩错误！");
			
			
		}else if(a<60){
			
		System.out.println("不及格");
			
		}else if(a>=60 && a<=69){
			
		System.out.println("及格");
			
		}else if(a>=70 && a<=79){
			
		System.out.println("良好");
		
		}else if(a>=80 && a<=89){
			
		System.out.println("很好");
		}else if(a>=90 && a<=100){
			
		System.out.println("优秀");
		}
		
		
	}
	
	
	
	
}