package assignment2;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		int reverse = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int number =num;
		while(number!=0) {
			int r = number%10;
			reverse=reverse*10+r;
			number=number/10;
		}
		if(num==reverse) {
			System.out.println(reverse+" is a palindrome");  
		}else {
			System.out.println(reverse+" is not a palindrome");
		}
		
	}

}
