package Assignment_15_01;
import java.util.Scanner;

import java.util.Objects;

public class Book {
	
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;

	public Book() {
		this("", 0, "", 0);
	}

	public Book(String isbn, double price, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter isbn ");
		this.isbn = sc.next();
		System.out.println("Enter price");
		this.price = sc.nextDouble();
		System.out.println("Enter authorName ");
		this.authorName = sc.next();
		System.out.println("Enter quntity ");
		this.quantity = sc.nextInt();
	}

	public void display() {
		System.out.println("isbn : " + this.isbn);
		System.out.println("price : " + this.price);
		System.out.println("authorName : " + this.authorName);
		System.out.println("quantity : " + this.quantity);

	}
	public String toString()
	{
		return "Book [isbn = "+isbn+ " ,price = "+price+" ,authorName = "+authorName+" , quantity=" + quantity + "]";
	}
	public int hashCode()
	{
		return Objects.hash(authorName,isbn,price,quantity);
	}
	public boolean equal(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(isbn,other.isbn);
	}



}
