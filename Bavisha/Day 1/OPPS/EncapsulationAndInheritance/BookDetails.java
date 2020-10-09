package EncapsulationAndInheritance;

import java.util.Scanner;

public class BookDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book book = new Book();
		System.out.println("enter book bookNo");
		book.setBookNo(sc.nextInt());
		System.out.println("enter book title");
		book.setTitle(sc.nextLine());
		System.out.println("enter book author");
		book.setAuthor(sc.nextLine());
		System.out.println("enter book price");
		book.setPrice(sc.nextInt());
		
		EngineeringBook engineeringBook = new EngineeringBook();
		System.out.println("enter book category");
		engineeringBook.setCategory("Novel");
	}

}
