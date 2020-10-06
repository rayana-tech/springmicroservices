package Assignemnet1;

import java.util.Scanner;

public class Assignment2Program7 {

	public static void main(String[] args) {
		System.out.println("enter lower and upper range");
		Scanner sc=new Scanner(System.in);
		int lower = sc.nextInt();
		int upper = sc.nextInt();
		System.out.println("lower"+lower +"upper"+upper);
		
		for(;lower<=upper;lower++)
		{
			System.out.println(lower);
		}

	}


}
