package assignment2;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int reverse = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		while(num!=0) {
			int r = num%10;
			reverse=reverse*10+r;
			num=num/10;
		}
		System.out.println("The reverse of the given number is: " + reverse);  
	}
	
}
