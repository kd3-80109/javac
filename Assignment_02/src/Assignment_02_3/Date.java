package Assignment_02_3;

import java.util.*;

public class Date {
	int day;
	int month;
	int year;

	Date() {
		this.day = 0;
		this.month = 0;
		this.year = 0;
	}

	Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int get_day() {
		return this.day;
	}

	public void set_day(int day) {
		this.day = day;
	}

	public int get_month() {
		return this.month;
	}

	public void set_month(int month) {
		this.month = month;
	}

	public int get_year() {
		return this.year;
	}

	public void set_year(int year) {
		this.year = year;
	}

	public void acceptdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day : ");
		this.day = sc.nextInt();
		System.out.println("Enter month : ");
		this.month = sc.nextInt();
		System.out.println("Enter year : ");
		this.year = sc.nextInt();

	}
	public void displaydata()
	{
		System.out.println(this.day +"/"+ this.month +"/"+ this.year );
	}
}
