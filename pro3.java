package project1;

public class pro3 {

	public static void main(String[] args) {

		for(int i =1; i<=10; i+=2) {
			for(int j = 9;j>i;j-=2) {
				System.out.print(" ");
			}
		for(int j = 0;j< i;j++) {
				System.out.print("*");
			}
		System.out.println("");
		}
		
		int count =0;
		for(int i =1;i<=9;i++) {
			if(i<=5) {
				count++;
			}else {
				count--;
			}
			for(int j =1;j<=5-count;j++) {
				System.out.print( "  ");
			}
			for(int k=1;k<=2*count-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i =1; i<=5; i++) {
			for(int j =0; j< 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0;i< 5; i++) {
			for(int j =6; j > 2*i-1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i =1; i<6; i++) {
			for(int j =5; j> i; j--) {
				System.out.print(" ");
			}
			for(int j =0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
			}
		for(int k =4; k>0; k--) {
			for(int j =0; j<k; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i =1; i<6; i++) {
			for(int j =5; j> i; j--) {
				System.out.print(" ");
			}
			for(int j =0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
			}
		for(int i =0; i<5;i++) {
			for(int j=0; j<i ; j++) {
				System.out.print("  ");
			}
			for(int j =5; j>i; j--) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
