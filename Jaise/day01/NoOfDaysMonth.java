package DayOne2;

import java.util.Scanner;

public class NoOfDaysMonth {
		
	public static void DaysinaMonth(String month,int year) {
	
	if(month == "january"|| month == "march" || month == "may" || month == "july" || month == "august" || month == "october" || month == "december") {
		System.out.print("Number of days is 31");
	}
	else if((month == "february") && ((year%400==0) || (year%4==0 && year%100!=0)))
	{
		System.out.print("Number of days is 29");
	}
	else if(month == "february")
	{
		System.out.print("Number of days is 28");
	}
	else
	{
		System.out.println("Number of days is 30");
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year;
		String month,mon;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Month  : ");
		mon= sc.nextLine();
		month=mon.toLowerCase();
		System.out.println("Enter Year :  ");
		year = sc.nextInt();
		//System.out.println();
		DaysinaMonth(month,year);
	}

}
