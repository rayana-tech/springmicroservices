package Assignemnet1;

import java.util.Scanner;

public class Assignmet2Pgm8 {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		int number = sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			int prod=number*i;
			System.out.println(number+"*"+i+"="+prod);
		}
	}

}
