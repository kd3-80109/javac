package Assignment_13_03;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * After Implement Comparable It Shows Sorted Entities By ISBN, Author_Name
		 * And Remove Duplicates
		 */
		Set <Bookkk> b = new TreeSet <> ();
		
		
		b.add(new Bookkk("12354","Rahul",3,800));
		b.add(new Bookkk("12347","Naveen",3,800));
		b.add(new Bookkk("12346","Akash",3,800));
		b.add(new Bookkk("1234","Rahul ",3,800));
		b.add(new Bookkk("1234","Rahul Kumar",3,800));
		b.add(new Bookkk("123467","Singh",3,800));
		b.add(new Bookkk("123478","Unnati",3,800));
		
		
		Iterator <Bookkk> itr = b.iterator();
		while(itr.hasNext())
		{
			Bookkk c = itr.next();
			System.out.println(c);
		}

	}


}
