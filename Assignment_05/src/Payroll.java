import java.util.*;
public class Payroll
{
	public static void main(String[] args) {
	    int choice;
	    Employee []emp=new Employee[4];//reference array
	    Scanner sc = new Scanner(System.in);
		boolean exit = false;
		while(!exit) {
			System.out.println("0.Exit ");
			System.out.println("1.Add SalariedEmp ");
			System.out.println("2.Add HouredEmp ");
			System.out.println("3.Add CommissionEmp ");
			System.out.println("4.Add Base-salaried ");
			System.out.println("Enter your choice");
			
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				  emp[0]=new SalariedEmp(1000);
				  emp[0].CalculateSalary();
				System.out.println("SalariedEmp="+emp[0].CalculateSalary());
				break;
			case 2:
				  emp[1]=new HouredEmp(12,10);
				  emp[1].CalculateSalary();
				System.out.println("HouredEmp="+emp[1].CalculateSalary());
				break;
				
			case 3:
				emp[2]=new CommissionEmp(2000,0.05);
				emp[2].CalculateSalary();
				System.out.println("CommissionEmp="+emp[2].CalculateSalary());
				break;
			case 4:
			 emp[3]=new BaseSalariedEmp(2000,0.05,1000);
				emp[3].CalculateSalary();
				System.out.println("Base-salariedp="+emp[3].CalculateSalary());
				break;
			case 100:
				exit=true;
				break;
				
			}
			
			
		}
		sc.close();
		System.out.println("Thanks..for using our app.....");
	}

}
