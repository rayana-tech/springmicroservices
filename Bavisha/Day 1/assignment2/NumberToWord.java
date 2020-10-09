package assignment2;

import java.util.Scanner;

public class NumberToWord {

	public static void main(String[] args) {
		  int n = 0;
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter an integer number: ");
	        n = s.nextInt();
	 
	        if (n <= 0)
	        {
	            System.out.println("Enter numbers greater than 0");
	        }
	        else
	        {
	            NumberToWord notoword = new NumberToWord();
	            notoword.covertNumberToWord((n / 1000000000), " Hundred");
	            notoword.covertNumberToWord((n / 10000000) % 100, " crore");
	            notoword.covertNumberToWord(((n / 100000) % 100), " lakh");
	            notoword.covertNumberToWord(((n / 1000) % 100), " thousand");
	            notoword.covertNumberToWord(((n / 100) % 10), " hundred");
	            notoword.covertNumberToWord((n % 100), " ");
	        }
	    }

	private void covertNumberToWord(int n, String ch) {
		 String one[] = { " ", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten",
	                " Eleven", " Twelve", " Thirteen", " Fourteen", "Fifteen", " Sixteen", " Seventeen", " Eighteen",
	                " Nineteen" };
	 
	        String ten[] = { " ", " ", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", "Seventy", " Eighty", " Ninety" };
	 
	        if (n > 19)
	        {
	            System.out.print(ten[n / 10] + " " + one[n % 10]);
	        }
	        else
	        {
	            System.out.print(one[n]);
	        }
	        if (n > 0)
	            System.out.print(ch);
	    }
	

}
