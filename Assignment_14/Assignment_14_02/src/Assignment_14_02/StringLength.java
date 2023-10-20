package Assignment_14_02;

import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.*;

public class StringLength {
	
	static int countIf(List<String> arr, Predicate<String> cond) {
		int count = 0;
		for (String str : arr) {
			if (cond.test(str))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		Collections.addAll(list,"AKASH","AAKASH","SUDHANSHU","RONALDO","VIRAT");
		
		Stream<String> str = list.stream();
        str.filter(ele -> ele.length()>6).forEach(ele->System.out.println(ele));
        
        int cnt = countIf (list,s->s.length()>6);
        System.out.println("no. of count = "+cnt);
        
	}

}
