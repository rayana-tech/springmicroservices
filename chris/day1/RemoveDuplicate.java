package day1;

import java.util.Scanner;
public class RemoveDuplicate{
	public static void main(String[] args){
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int arr_size = sc.nextInt();
		int[] arr = new int[arr_size];
		System.out.println("After removing duplicate element array are :");
		for(i=0;i<arr_size;++i)
		{
                                   for(j=i+1;j<arr_size;){
				if(arr[i] == arr[j]){
					for(int temp = j; temp<arr_size; ++temp){
						arr[temp] = arr[temp+1];
					}
					arr_size = arr_size-1;		
				}		
				else
					j++;		
			}}
		for(i=0;i<arr_size;++i)
			System.out.println(arr[i]);
	}}
	