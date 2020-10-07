package MyFirstPackage;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		int i,number;
		Scanner sc = new Scanner(System.in);
		System.out.print(" Please Enter Number : ");
		number = sc.nextInt();
		int arr[] = new int[number];
		for(i=1;i<=number;i++) {
			int d=i*i*i;
			System.out.println(d);
		}
		
	}

}
