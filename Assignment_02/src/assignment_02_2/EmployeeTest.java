package assignment_02_2;

public class EmployeeTest 
{

		public static void main(String[] args) {
			Employee e1=new Employee();
			e1.acceptdata();
			e1.displaydata();
			
//			Employee e2=new Employee("Akash","kakad",1000000);
//			e2.displaydata();
			System.out.println("increment salary:"+e1.incrementSalary());
//		
		}
}

