package Day1Assignment;

import java.util.Scanner;

public class FirstNSeries {
public static void findNseries(int n) {
	int d, i;
	for(i=1;i<=n;i++)
	{

	d=i*i*i;
	System.out.print(d+",");
	
	}
	
}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 System.out.print("Enter the value of N:");
		 int num= sc.nextInt();
		 findNseries(num);
		
		
		
}}
