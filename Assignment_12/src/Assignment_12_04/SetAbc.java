package Assignment_12_04;
import java.util.*;

public class SetAbc {

	public static void main(String[] args) {
		//Collection<String> c = new ArrayList<>();	//[B, D, A, C, null, null, null]
		//Collection<String> c = new HashSet<>();	//[null, A, B, C, D]
		//Collection<String> c = new LinkedHashSet<>();	//[B, D, A, C, null]
		Collection<String> c = new TreeSet<>();//NullPointerException
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
		c.add(null);
		c.add(null);
		c.add(null);
		System.out.println(c.toString());

	}

}
