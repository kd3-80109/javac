package Assignment_14_08;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.*;

public class Sum {

	public static void main(String[] args) {
		IntStream s= IntStream.range(1, 10);
		int sum=s.sum();
		System.out.println(sum);
		IntStream s1 = IntStream.range(1, 10);
		System.out.println(s1.summaryStatistics());
		

	}

}
