package day1;

import java.util.Scanner;
class DispDate{  
public static void main(String args[]){ 
int Days = 0; 
  Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = sc.nextInt();
System.out.print("Enter the month: ");
		String month = sc.next();
		switch (month) {
         case "January":
             Days = 31;
             break;
         case "February":
             if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                 Days = 29;
					
             } else {
                 Days = 28;
             }
             break;
         case "March":
             Days = 31;
             break;
         case "April":
             Days = 30;
             break;
         case "May":
             Days = 31;
             break;
         case "June":
             Days = 30;
             break;
         case "July":
             Days = 31;
             break;
         case "August":
             Days = 31;
             break;
         case "September":
             Days = 30;
             break;
         case "October":
             Days = 31;
             break;
         case "November":
             Days = 30;
             break;
         case "December":
             Days = 31;
     }
     System.out.print(month + " " + year + " has " + Days + " days\n");
 }

}