package assignment2;

import java.util.Scanner;

public class MathamaticalTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		System.out.println("mathematical table of "+num);
		for(int i=1;i<=10;i++) {
			
			System.out.println(i +"*"+num +"=" +i*num);
		}

	}

}
