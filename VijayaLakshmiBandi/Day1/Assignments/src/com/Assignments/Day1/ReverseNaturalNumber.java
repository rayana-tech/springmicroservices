package com.Assignments.Day1;

import java.util.Scanner;

public class ReverseNaturalNumber {
	public static void main(String[] args) 
	{
		int number, i;
		Scanner sc = new Scanner(System.in);

		System.out.print(" Please Enter the Maximum integer Value : ");
		number = sc.nextInt();	

		i = number;

		while(i >= 1)
		{
			System.out.print(i +" "); 
			i--;
		}	
	}
}
