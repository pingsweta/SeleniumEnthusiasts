package basic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int a=1, b=0, c=0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number to know its factorial");
		int number= s.nextInt();
		int result =1;
		
		for(int i=number; i>0; i--){
		
			result = result*number;
			number--;
		}
			
		
	
		System.out.println(result);
	}
}
