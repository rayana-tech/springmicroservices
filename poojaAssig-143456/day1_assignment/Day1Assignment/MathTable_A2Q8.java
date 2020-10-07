package Day1Assignment;

import java.util.Scanner;

public class MathTable_A2Q8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int temp=1;
		for(int i=1;i<=10;i++) {
			temp=num*i;
			System.out.println(num+" *"+ i+" ="+temp);
		}
	}

}
