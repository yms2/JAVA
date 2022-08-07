package project1;

public class pro5 {

	public static void main(String[] args) {
//300까지 홀수 합
		
		  int n=1;
		  int s=1;
		  while(n<299){
		   // 홀수만 더해가는 수식
		   n+=2;
		   s = s + n;
		  }
		  System.out.println("결과 : "+s);
		  
		  int t = 1;
		  while(n<9){
		   // 홀수만 더해가는 수식
		   n+=2;
		   t =t * n;
		  }
		  System.out.println("결과 : "+t);
		  
		  
		 }
	}

