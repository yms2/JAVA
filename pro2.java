package project1;
//정수를 입력받아 입력 받은 숫자의 배수 합을 구하는 프로그램
import java.util.Scanner;

public class pro02 {

	public static void main(String[] args) {
		  int number=0;
		  int sum=0;
		 
		  Scanner in=new Scanner(System.in);
		  System.out.println("수를 입력하세요:");
		  number=in.nextInt(); //number이라는 수가 입력수얏 
		 
		  for(int i=0; i<100;i++)
		  {
		   if(i%number==0)
		   {
		    sum+=i;
		   }
		  }
		  System.out.println(number+"의배수합="+sum);
        
		  
	}

}
