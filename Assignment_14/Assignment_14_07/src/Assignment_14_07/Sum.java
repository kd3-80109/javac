package Assignment_14_07;

import java.util.Random;
import java.util.stream.Stream;

public class Sum {
	public static void main(String[] args) {

		Random r = new Random();
		Stream<Integer>strm=Stream.generate(()->r.nextInt(10)).limit(10);
		
		int res = strm.reduce(0,(a,e)->(a+e));
		System.out.println("sum of 10 random no. is : "+res);
	}
}