package Assignemnet1;

import java.util.Scanner;

public class Assignment2Program1 {

	public static void main(String[] args) {
		int number,sum=0;
		Scanner sc=new Scanner(System.in);
		number = sc.nextInt();
		while(number>0)
		{
			sum+=number%10;
			number=number/10;
		}
		
		System.out.println("sum="+sum);

	}

}
