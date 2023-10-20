package Assignment_13_06;
import java.util.Scanner;

public class Student {
	
	private int rollno;
	private String name;
	private double marks;
	
	
	Student()
	{
		
	}


	public Student(int rollno, String name, double marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll no");
		rollno = sc.nextInt();
		System.out.println("Enter Name");
		name = sc.next();
		System.out.println("Enter Marks");
		marks = sc.nextDouble();
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getMarks() {
		return marks;
	}


	public void setMarks(double marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	


}
