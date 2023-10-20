package Assignment_14_02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Objects;;

public class Main {

	public static void main(String[] args) {
		Set<Book> set = new LinkedHashSet<Book>();
		set.add(new Book("11ab", 100.0, "Jack", 2));
		set.add(new Book("12ab", 200.0, "Mack", 3));
		set.add(new Book("13ab", 300.0, "Pack", 4));
		set.add(new Book("14ab", 400.0, "Sack", 5));
		set.add(new Book("15ab", 500.0, "Lack", 6));
		set.add(new Book("12ab", 200.0, "Jack", 7));

		Iterator<Book> itr = set.iterator();
		while (itr.hasNext())

		{
			Book b = itr.next();
			System.out.println(b);
		}

	}

}
//output:-
//Book [isbn = 11ab ,price = 100.0 ,authorName = Jack , quantity=2]
//Book [isbn = 12ab ,price = 200.0 ,authorName = Mack , quantity=3]
//Book [isbn = 13ab ,price = 300.0 ,authorName = Pack , quantity=4]
//Book [isbn = 14ab ,price = 400.0 ,authorName = Sack , quantity=5]
//Book [isbn = 15ab ,price = 500.0 ,authorName = Lack , quantity=6]
//Book [isbn = 12ab ,price = 200.0 ,authorName = Jack , quantity=7]


//solution for duplicate :-

//public int hashCode() {
//	int hash = Objects.hash(this.isbn);
//
//	return hash;
//}
//
//public boolean equal(Object obj)
//{
//	if (this == obj)
//		return true;
//	if (obj == null)
//		return false;
//	if(obj instanceof Book) {
//		
//	Book other = (Book) obj;
//	if (this.isbn == other.isbn)
//	return true;
//	}
//	return false;
//
//}


//Book [isbn = 11ab ,price = 100.0 ,authorName = Jack , quantity=2]
//Book [isbn = 12ab ,price = 200.0 ,authorName = Mack , quantity=3]
//Book [isbn = 13ab ,price = 300.0 ,authorName = Pack , quantity=4]
//Book [isbn = 14ab ,price = 400.0 ,authorName = Sack , quantity=5]
//Book [isbn = 15ab ,price = 500.0 ,authorName = Lack , quantity=6]
//Book [isbn = 12ab ,price = 200.0 ,authorName = Jack , quantity=7]

             
