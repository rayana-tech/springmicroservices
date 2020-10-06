package com.Assignments.Day1;

public class PrimeNumber {
	public static void main(String[] args) {
		int fact = 11;
		boolean flag = false;
        for(int i = 2; i <= fact/2; ++i)
        {
            if(fact % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(fact + " is a prime number.");
        else
            System.out.println(fact + " is not a prime number.");
	}
}
