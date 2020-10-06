package com.Assignment1.Day1;

import java.util.Scanner;

public class Program8_Pyramid {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many rows in the pyramid:");
		int noOfRows = scan.nextInt();
		int rowCount = 1;
		System.out.println("Pyramid :");
		for(int i = noOfRows; i >= 1; i--) {
			for(int j = 1; j <= i*2; j++) {
				System.out.print(" ");
			}
			
			for(int j = i; j <= noOfRows; j++) {
				System.out.print(j+" ");
			}
			for(int j = noOfRows-1; j>= i; j-- ) {
				System.out.print(j+" ");
			}
			System.out.println();
			rowCount++;
		}
	}
}
