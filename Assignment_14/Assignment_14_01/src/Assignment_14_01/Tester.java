package Assignment_14_01;
import java.util.*;
import Assignment_14_01.Clerk;
import Assignment_14_01.Employee;
import Assignment_14_01.Labour;
import Assignment_14_01.Manager;
import Assignment_14_01.*;

public class Tester {

	public static void main(String[] args) {
Employee[] arr = new Employee[3];
		
		arr[0] = new Manager(10000,4000);
		arr[1] = new Labor(310,20);
		arr[2] = new Clerk(7000);
		
		System.out.println(Employee.calcTotalIncome(arr));


	}

}
