package assignment2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number for factorial");
		int num= sc.nextInt();
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			checkPrime(fact);
		}

	}

	private static void checkPrime(int fact) {
		boolean flag = false;
		for(int i=2;i<fact/2;i++) {
			if(fact%i==0) {
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println(fact + " is a prime number.");
		}else {
			System.out.println(fact + " is not a prime number.");
		}
			
		
	}

}
