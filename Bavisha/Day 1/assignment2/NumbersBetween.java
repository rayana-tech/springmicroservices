package assignment2;

import java.util.Scanner;

public class NumbersBetween {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter starting number");
		int start = sc.nextInt();
		System.out.println("enter ending number");
		int end = sc.nextInt();
		for(int i=start+1;i<=end-1;i++) {
			System.out.println(i);
		}
	}

}
