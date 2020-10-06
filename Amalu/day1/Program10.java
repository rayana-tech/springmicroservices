package Assignemnet1;

import java.util.Arrays;
import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		int[] arra = new int[10];
		for(int i=0;i<10;i++)
		{
			number=sc.nextInt();
			arra[i]=number;
		}
Arrays.sort(arra);
		for(int i=0;i<10;i++)
		{
			System.out.print(arra[i]+" ");
		}

	}

}
