package Assignment_13_04;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Using Comparator Entities in Descending And Asscending
		 */
		
		class bookcomparator implements  Comparator<Bookkkk>
		{

			@Override
			public int compare(Bookkkk b1, Bookkkk b2) {
				// TODO Auto-generated method stub
				int diff = Double.compare(b1.getPrice(), b2.getPrice());
				return diff;
			}
			
		}
		
		bookcomparator b1 = new bookcomparator();
		
		TreeSet <Bookkkk> b = new TreeSet <> (b1);
		
		
		b.add(new Bookkkk("1234","Rathore",1,600));
		b.add(new Bookkkk("1234","Rathore",1,600));
		b.add(new Bookkkk("12345","Prashant",1,2600));
		b.add(new Bookkkk("12346","Prince",1,6020));
		b.add(new Bookkkk("12347","rahul",1,6600));
		b.add(new Bookkkk("12348","Rahul",1,8600));
		b.add(new Bookkkk("12349","Akshaaa",1,9600));
		b.add(new Bookkkk("12340","Akash",1,12600));
		
		Iterator <Bookkkk> itr = b.iterator();
		while(itr.hasNext())
		{
			Bookkkk b2 = itr.next();
			System.out.println(b2);
		}
		
		Iterator <Bookkkk> itr2 = b.descendingIterator();
		while(itr2.hasNext())
		{
			Bookkkk b3=itr2.next();
			System.out.println(b3);
		}
	}


}
