import java.util.Scanner;

public class NaturalNumRange {
	private static Scanner sc;

	public static void main(String[] args) {
		int minimum, maximum;
		sc = new Scanner(System.in);

		System.out.print(" Please Enter the Minimum value : ");
		minimum = sc.nextInt();

		System.out.print(" Please Enter the Maximum value : ");
		maximum = sc.nextInt();

		NaturalNumbers(minimum, maximum);
	}

	public static void NaturalNumbers(int min, int max) {
		int i;

		for (i = min; i <= max; i++) {
			System.out.print(i + " ");
		}
	}
}