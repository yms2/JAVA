package project1;

import java.util.Scanner;

public class pro1 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("수를 입력하세요:");
        int m,i,sum =0;
        m = in.nextInt();

        for(i=1; i <= 500;i++){
            if(i % m==0){
                sum=sum+i;
            }
        }
        System.out.printf("%d",sum);
        
		}
	
}

