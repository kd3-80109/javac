package Assignment_12_02;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Max {

	public static void main(String[] args) {
		List<String>str = new ArrayList<String>();
		str.add("Akash");
		str.add("Virat");
		str.add("Dhoni");
		str.add("Messi");
		str.add("Chhetri");
//		
		CoustomComparator comparator = new CoustomComparator();

		//String longestString = Collections.max(string,(s1,s2) -> s1.length() - s2.length());
		//System.out.println("String with the higest length : "+longestString);
		 String res = Collections.max(str,comparator);
		 System.out.println("String with the higest length : "+res);
		

	}

}
