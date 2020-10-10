public class Demo06Sum{
	public static void main(String[] args){
		
		int sum=0;
		for (int i=1;i<=100;i++){
			
			if(i%2==0){
				System.out.println("偶数为："+i);
				
				sum=sum+i;
				
			}
			
		}
		
		System.out.println("1-100的代数和为："+sum);
		
		
		
	}
	
	
	
}