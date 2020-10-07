package day1;

import java.util.Scanner;
public class ReverseNumber {

    public static void main(String[] args) {

        int  rev = 0;
Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();	
        while(num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + rev);
    }
}