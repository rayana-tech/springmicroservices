package day1;

import java.util.Scanner;
public class Sum{
	public static void main(String[] args){
		int lastDigit,sum1 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the integer: ");
		int n = sc.nextInt();
	
   while(n != 0) {
      lastDigit = n % 10;
     sum1 = sum1 + lastDigit;
      n = n / 10;
   }
   System.out.println("Sum of digits is"+sum1);
}
}