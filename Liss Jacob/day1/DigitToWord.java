package day1;

import java.util.Scanner;

class DigitToWord { 
	  
    static String one[] = { "", "one ", "two ", "three ", "four ", 
                            "five ", "six ", "seven ", "eight ", 
                            "nine " }; 
  
    static String numToWords(String s) 
    { 
        String str = ""; 
        int n = 0;
		if(n<=9){
            str += one[n]; 
        } 
  
        return str; 
    } 
	static String convertToWords(int n) 
    { 
        String out = ""; 
        String s="";
		out += numToWords(s); 
        return out; 
    } 
    public static void main(String[] args) 
    { 
	     	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter any number less than 10 and greater than 0 ");
                 int  n=sc.nextInt();
           System.out.print(convertToWords(n)); 
    } 
} 
  
  
  
  