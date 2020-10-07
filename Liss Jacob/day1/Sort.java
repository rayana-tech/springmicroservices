package day1;

import java.util.Scanner;

class Sort {
public static void main(String args[]) {
int size=10;
int[] num = new int[size];
int[] numArray = new int[size];
for (int i = 0; i < size; i++) {
System.out.print("Enter element : ");
Scanner sc=new Scanner(System.in);
num[i] = sc.nextInt();
}
for (int i = 0; i < size-1; i++) {
System.out.print(num[i] + ",");
}
System.out.println(numArray[num.length - 1]);
for (int i = 0; i < num.length; i++) {
for (int j = i + 1; j < num.length; j++) { 
if (num[i] > num[j]) {
     int tempValue = num[i];
      num[i] = num[j];
      num[j] = tempValue;
  }
}
}
System.out.println("Final array after the sorting : ");
for (int i = 0; i < size - 1; i++) {
System.out.print(num[i] + ",");
}
System.out.println(numArray[num.length - 1]);

}
}
