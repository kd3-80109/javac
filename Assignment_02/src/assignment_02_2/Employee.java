package assignment_02_2;

import java.util.*;

public class Employee {

	String fname;
	String lname;
	double salary;

	Employee()

	{
		this.fname = "";
		this.lname = "";
		this.salary = 0;

	}

	Employee(String fname, String lname, double salary) {
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
	}

	public String get_fname() {
		return fname;
	}

	public void set_fname(String fname) {
		this.fname = fname;
	}

	public String get_lname() {
		return lname;
	}

	public void set_lname(String lname) {
		this.lname = lname;
	}

	public double get_salary() {
		return salary;
	}

	public void set_salary(double salary) {
		this.salary = salary;
	}

	public void acceptdata() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter frist name: ");
		this.fname = sc.next();
		System.out.println("Enter last name: ");
		this.lname = sc.next();
		System.out.println("Enter salary: ");
		this.salary = sc.nextDouble();

	}

	public void displaydata() {
		System.out.println("Fist name " + this.fname);
		System.out.println("Last name " + this.lname);
		System.out.println("Salary " + this.salary);

	}
	public double incrementSalary()
	{
		return (this.salary *12)*0.1+this.salary*12;//for display salary "this.salary*12";
	}

}
