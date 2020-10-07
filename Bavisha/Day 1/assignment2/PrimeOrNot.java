package assignment2;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		boolean flag = false;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		for(int i =2;i<=num/2;i++) {
			if(num%i==0) {
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println(num +" is prime number");
		}else {
			System.out.println(num +" is not prime number");
		}
	}

}
