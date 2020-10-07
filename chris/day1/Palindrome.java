package day1;


import java.util.Scanner;
class Palindrome
{
	public static void main(String arg[])	
	{
	    int num,pal,s,rem;
             	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter any number ");
                   num=sc.nextInt();
	    pal=num;
	    for(s=0;num>0;num/=10)
	    {
	    rem=num%10;
	    s=(s*10)+rem;
	    }
	   if(s==pal)
		System.out.println(num+" is a palindrome number ");
                  else
		System.out.println(num+" is not a palindrome number ");
                  
	}
}
