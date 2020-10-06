package Assignemnet1;

public class Program7 {

	public static void main(String[] args) {
		
			
			int rows=5;
			int count=1; //initializing count with 1
			int i,j;//variable declaration
			for(i=rows; i>=1; i-- ){//outer for loop(parent)
			 for(j=1; j<=i*2; j++){
			 System.out.print(" ");//create space from te begining of each row
			 }//inner for loop 1(child)
			 for(j=i; j<=rows; j++){//print right part of Piramid
			 System.out.print(j+" ");
			 }//inner for loop 2
			for(j=rows-1; j>=i; j--){
			 System.out.print(j+" "); //print left part of Piramid
			 }//inner for loop 3
			  System.out.println();
			count++;//count increse with 1
			 }
			 
			}

	}

