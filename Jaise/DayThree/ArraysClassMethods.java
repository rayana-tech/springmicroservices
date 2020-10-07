package DayThree;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntUnaryOperator;

public class ArraysClassMethods {
	public static void main(String[] args) {
		
		int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		IntUnaryOperator g = num -> {
			if (num % 2 == 0)
				return num * num;
			else
				return num;
		};
		Arrays.parallelSetAll(intArray, g);
		
		System.out.println("Set all elements of the specified array using parallelSetAll()");
		Arrays.stream(intArray).forEach(ele -> System.out.print(ele + " "));
		
		int[] arr = Arrays.copyOf(intArray, intArray.length);
		Arrays.setAll(arr, e -> {
			if (e % 2 == 0)
				return e * e;
			else
				return e;
		});
		
		System.out.println("\n Set all elements of the specified array using setAll()");
		Arrays.stream(arr).forEach(ele -> System.out.print(ele + " "));

		
		Country[] arr1 = { new Country("Ind1001", "India"), new Country("Ind1001", "India"),
				new Country("Aus1002", "Australia") };

		Country[] arr2 = { new Country("Ind1001", "India"), new Country("Ind1001", "India"),
				new Country("Aus1002", "Australia") };
		Country[] arr3 = { new Country("Ind1001", "India"), new Country("Aus1002", "Australia"),
				new Country("Ind1001", "India"), };
		System.out.println("\n is arr1 equals to arr2 : " + Arrays.equals(arr1, arr2));
		System.out.println("is arr1 equals to arr3 : " + Arrays.equals(arr1, arr3));
		
		String topics[] = new String[] { "Java", "Spring", "Hiberante", "Angular" };
		List<String> list = Arrays.asList(topics);
		System.out.println("The list is: " + list);
		
		int[] array2 = { 13, 7, 6, 45, 21, 9, 101, 102 };
		Arrays.sort(array2);
		System.out.printf("Sorted order : %s", Arrays.toString(array2));
		
		int array3[] = { 2, 2, 1, 8, 3, 2, 2, 4, 2 };
		Arrays.fill(array3, 10);
		System.out.println("\n Array completely filled" + " with 10\n" + Arrays.toString(array3));
		
		Object[] array4 = { 3, 5, new int[] { 6, 7, 9 } };
		Object[] array5 = { 3, 5, new int[] { 6, 7, 9 } };
		System.out.println(array4.equals(array5));
		System.out.println(Arrays.equals(array4, array5));
		System.out.println(Arrays.deepEquals(array4, array5));
		
		int array6[] = { 12, 13, 14, 15, 16, 17, 18 };
		int[] copy = Arrays.copyOfRange(array6, 2, 6);
		for (int i : copy)
			System.out.print(i + "  ");
		
		Arrays.parallelPrefix(array6, (x, y) -> compute(x, y));
		System.out.println("\n result of Arrays.parallelPrefix() method" + Arrays.toString(array6));
	}


	static int compute(int x, int y) {
		return x + y;
	}
}
