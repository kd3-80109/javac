package Assignment_14_01;
import java.util.*;
import Assignment_14_01.*;

public class Employee {
	
abstract double getSal();
	
	default double calcIncentives() {
		return 0.0;
	}
	
	static double calcTotalIncome (Employee arr[]) {
		double totalIncome = 0.0;
		for(Employee a : arr) {
		double income = a.calcIncentives() + a.getSal();
 		totalIncome = totalIncome + income;
		}
		return totalIncome;
	}

}
