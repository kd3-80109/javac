package Assignment_14_06;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class Fact {

	public static void main(String[] args) {
		
		
		Random r = new Random();
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter number : ");
		num = sc.nextInt();
		Stream<Integer>strm = Stream.iterate(1, x->x+1).limit(num);
		int res=strm.reduce(1, (a,b)->a*b);
		System.out.println("factorial of given no. : "+res);
	}

}
