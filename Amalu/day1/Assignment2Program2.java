package Assignemnet1;

import java.util.Scanner;

public class Assignment2Program2 {
	public static void main(String[] args) {
	int number,sum=1;
	System.out.println("enter number");
	Scanner sc=new Scanner(System.in);
	number = sc.nextInt();
	for(int i=1;i<=number;i++)
	{
		sum*=i;
	}
	System.out.println("factorial="+sum);

int num=2;
int flag =0;
while(num<=sum/2)
{

	if(sum%num==0)
	{
		flag=-1;
		break;
	}
}
if(flag==-1)
{
	System.out.println("not prime");
}
else
{
	System.out.println("prime");
}
}
}