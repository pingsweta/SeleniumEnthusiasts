package basic;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.println("Enter word to check if it is a palindrome");
		String word = s.next();
		int flag = 0;

		int length = word.length();
		System.out.println(length);
		/*if (length % 2 == 0) {
			flag = 0;
		} else {
			flag = 1;
		}*/

		//if (flag == 0) {
			for (int i = 0; i < (length/2); i++) {

				if (word.charAt(i) == word.charAt(length-1))
				{
					flag=1;
					length--;
					System.out.println(length);
				}
				else{
					flag=0;
					System.out.println("Test");
					break;
				}
				if (flag==0){
					System.out.print("Not a palindrome");
				}else{
					System.out.print("This is a palindrome");
				}
			}
			
		}
	}

