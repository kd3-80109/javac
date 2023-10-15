package Assignment_02_1;

import java.util.*;

public class Invoice {
	String partno;
	String partdesc;
	int qunt;
	double price;

	public Invoice() {
		this.partno = "";
		this.partdesc = "";
		this.qunt = 0;
		this.price = 0;
	}

	Invoice(String partno, String partdesc, int qunt, double price) {
		this.partno = partno;
		this.partdesc = partdesc;
		this.qunt = qunt;
		this.price = price;
	}

	public String get_partno() {
		return this.partno;
	}

	public void set_partno(String partno) {
		this.partno = partno;
	}

	public String get_partdesc() {
		return this.partdesc;
	}

	public void set_partdesc(String partdesc) {
		this.partdesc = partdesc;
	}

	public int get_qunt() {
		return this.qunt;
	}

	public void set_qunt(int qunt) {
		if (this.qunt > 0)
			this.qunt = qunt;
		else
			this.qunt = 0;
	}

	public double get_price() {

		return this.price;
	}

	public void set_price(double price) {
		if (this.price > 0)
			this.price = price;
		else
			this.price = 0;

	}

	public void acceptdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter part number : ");
		this.partno = sc.next();
		System.out.println("Enter part description : ");
		this.partdesc = sc.next();
		System.out.println("Enter part quntity : ");
		this.qunt = sc.nextInt();
		System.out.println("Enter part price : ");
		this.price = sc.nextDouble();

	}

	public void displaydata() {
		System.out.println("Part no : " + partno);
		System.out.println("Part description : " + partdesc);
		System.out.println("Part quntity : " + qunt);
		System.out.println("Part price : " + price);

	}

	double calculateAmount() {
		double amount = qunt * price;
		return amount;
	}

}
