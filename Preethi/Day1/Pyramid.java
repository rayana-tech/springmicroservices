/*
public class Pyramid {
public static void main(String args[])
{
	int rows =5;
	for (int i =rows; i >=1; --i)
	{
		for (int j=1;j<=1;++j)
		{
			System.out.println(j+" ");
			
		}
		System.out.println();
	}
			
}
}


*/

import java.util.Scanner;

public class Pyramid
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);


		System.out.println("How Many Rows You Want In Your Pyramid?");

		int noOfRows = sc.nextInt();


		int rowCount = noOfRows;

		System.out.println("Here Is Your Pyramid");


		for (int i = 0; i < noOfRows; i++)
		{

			for (int j = 1; j <= i*2; j++)
			{
				System.out.print(" ");
			}


			for (int j = 1; j <= rowCount; j++) 			
			{
				System.out.print(j+" ");
			}

			
			for (int j = rowCount-1; j >= 1; j--)
			{ 				
				System.out.print(j+" "); 			
			}
			
			System.out.println();

			rowCount--;
		}
	}
}