package DayOne2;

import java.util.stream.IntStream;
public class NaturalnNum {
	public static void main(String[] args) {
        System.out.println("Limit is 10 ");
        int n=10;
        IntStream.rangeClosed(1, n).forEach(System.out::println);
	}
}
