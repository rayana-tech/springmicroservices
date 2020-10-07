package day1;

import java.util.Scanner;
public class Prime {
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();	
 boolean flag = false;
 int j=2;
 while(j <= num/2)
        {
            if(num % j == 0)
            {
                flag = true;
                break;
            }

            ++j;
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
