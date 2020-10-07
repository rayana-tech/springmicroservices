package day3;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SpecialStream {

		public  static  IntStream getSquaresOfThree(){
			IntStream stream = IntStream.range(20, 50).filter(i -> i % 3 == 0).map(num -> num * num);
			return stream;
				        }
		        
		
			private static List<Integer> getMultiplesOfFive() {
				List<Integer> multiples = IntStream.iterate(0, i -> i + 5)
		                .mapToObj(Integer::valueOf)
		                .limit(20)
		                .collect(Collectors.toList());
		   return multiples;
			}
				
		public static void main(String[] args) {
			
			IntStream square = getSquaresOfThree();
				System.out.print(square);
				List<Integer> multiFives =getMultiplesOfFive();
				System.out.println(multiFives);

		


		    	

		}
}
