package Assignment_14_01;
import java.util.*;
import Assignment_14_01.*;


public class Clerk implements Employee{
	private double salary;
	
	public Clerk() 
	{
	}

	public Clerk(double salary) {
		this.salary = salary;
	}
	
	@Override
	public double getSal() {
		return this.salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Clerk [salary=" + salary + "]";
	}
}