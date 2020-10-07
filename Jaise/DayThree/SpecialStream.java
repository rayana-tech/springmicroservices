package DayThree;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SpecialStream {

		private static IntStream getSquaresOfThree() {
			IntStream stream = IntStream.range(20, 50).filter(i -> i % 3 == 0).map(num -> num * num);
			return stream;
		}
		private static List<Integer> getMultiplesOfFive() {
			List<Integer> ints = IntStream.iterate(0, i -> i + 5)
	                .mapToObj(Integer::valueOf)
	                .limit(20)
	                .collect(Collectors.toList());
	   return ints;

		}
		public static void main(String[] args) {
			IntStream stream = getSquaresOfThree();
			stream.forEach(System.out::println);
			List<Integer> multiFives =getMultiplesOfFive();
			System.out.println(multiFives);
		}
	
}
