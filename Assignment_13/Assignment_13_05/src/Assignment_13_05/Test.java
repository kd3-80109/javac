package Assignment_13_05;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


public class Test {
	
	public static int menu()
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("0.EXIT");
		System.out.println("1.Add Book");
		System.out.println("2.Find Book");
		System.out.println("3.Display Book");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		
		Map<String,Book> map = new HashMap<> ();
		Book b1;
		
		Scanner sc = new Scanner(System.in);
		
		while((choice = menu())!=0)
		{
			switch(choice)
			
			{
			case 1:
				Book b = new Book();
				b.accept();
				map.put(b.getIsbn(), b);
				break;
				
			case 2:
				System.out.println("Enter ISBn to find Book");
				String isbn = sc.next();
				Book c = map.get(isbn);
				System.out.println(c);
				break;
				
			case 3:
				//System.out.println(map.toString());
				Set <Entry<String,Book>> entries = map.entrySet();
				for(Entry<String,Book> entry:entries)
					System.out.println("-->"+entry.getValue());
				break;
				
			default:
				System.out.println("Wrong Input!!");
				break;
			
			}
		}
		System.out.println("Thank You!");
		

	}

}
