	import java.util.List;
	import java.util.stream.Collectors;
	import java.util.stream.IntStream;

	public class Calculation {
		private static IntStream getSquaresOfThree() {
			IntStream three = IntStream.range(20, 50).filter(i -> i % 3 == 0).map(num -> num * num);
			return three;
		}
		private static List<Integer> getMultiplesOfFive() {
			List<Integer> five = IntStream.iterate(0, i -> i + 5)
	                .mapToObj(Integer::valueOf)
	                .limit(20)
	                .collect(Collectors.toList());
	   return five;

		}
		public static void main(String[] args) {
			IntStream intStream = getSquaresOfThree();
			intStream.forEach(System.out::println);
			List<Integer> multipliesOFFives =getMultiplesOfFive();
			System.out.println("Multiples of 5 :" + multipliesOFFives);
		}

		
	}


