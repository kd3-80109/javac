package Assignment_13_06;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

public class Test {
	
	public static int menu()
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Choice!");
		System.out.println("0. EXIT");
		System.out.println("1. Add Student");
		System.out.println("2. Find Student");
		System.out.println("3. Display All");
		choice = sc.nextInt();
		
		return choice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <Integer,Student> s = new LinkedHashMap<>();
		int choice;
		Student st;
		
		while((choice=menu())!=0)
		{
			switch(choice)
			{
			case 1:
				st = new Student();
				st.accept();
				s.put(st.getRollno(), st);
				break;
				
				
			case 2:
				System.out.println("Enter Roll no Key to Find");
				Scanner sc = new Scanner(System.in); 
				int roll = sc.nextInt();
				st = s.get(roll);
				if(st!=null)
				{
					System.out.println(st);
				}
				else
				{
					System.out.println("Key Not Found ");
				}
				break;
			case 3:
				Set<Entry<Integer,Student>>entries = s.entrySet();
				for(Entry<Integer,Student>entry:entries)
					System.out.println(entry.getValue());
				
				break;
				
			default:
					System.out.println("Enter valid Choice Werong Choice!!");
				break;
			}
		}

	}


}
