package Assignment_13_04;
import java.util.Objects;
import java.util.Scanner;

public class Bookkkk implements Comparable <Bookkkk> {

	 private String isbn;
	   private String authorname;
	   private int quantity;
	   private double price;

	   public  Bookkkk() 
	   {
		   
	   }

	   public  Bookkkk(String isbn, String authorname, int quantity, double price) {
	      this.isbn = isbn;
	      this.authorname = authorname;
	      this.quantity = quantity;
	      this.price = price;
	   }


	 public void accept() {
	      System.out.println("Enter ISBN");
	      Scanner sc = new Scanner(System.in);
	      this.isbn = sc.next();
	      System.out.println("Enter Author_Name");
	      this.authorname = sc.next();
	      System.out.println("Enter Quantity");
	      this.quantity = sc.nextInt();
	      System.out.println("Enter price");
	      this.price = sc.nextDouble();
	   }

//	   public String toString() {
//	      return "Book [isbn=" + this.isbn + ", authorname=" + this.authorname + ", quantity=" + this.quantity;
//	   }
	 
	 

	   public String getIsbn() {
	      return this.isbn;
	   }

	   @Override
	public String toString() {
		return "Bookkkk [isbn=" + isbn + ", authorname=" + authorname + ", quantity=" + quantity + ", price=" + price
				+ "]";
	}

	public void setIsbn(String isbn) {
	      this.isbn = isbn;
	   }

	   public String getAuthorname() {
	      return this.authorname;
	   }

	   public void setAuthorname(String authorname) {
	      this.authorname = authorname;
	   }

	   public int getQuantity() {
	      return this.quantity;
	   }

	   public void setQuantity(int quantity) {
	      this.quantity = quantity;
	   }

	   public double getPrice() {
	      return this.price;
	   }

	   public void setPrice(double price) {
	      this.price = price;
	   }

	

	public int hashCode() {
		int hash = Objects.hash(this.isbn);
		return hash;
	}


	   
	   

//	   public boolean equals(Object obj) {
//	      if (this == obj) {
//	         return true;
//	      } else if (obj == null) {
//	         return false;
//	      } else {
//	         if (obj instanceof Bookkkk) {
//	            Bookkkk other = (Bookkkk)obj;
//	            //if (this.isbn.equals(other.isbn)) {
//	            if (this.price==other.price) {
//	               return true;
//	            }
//	         }
//
//	         return false;
//	      }
//	   }

	public int compareTo(Bookkkk b2) {
		// TODO Auto-generated method stub
		int diff = this.isbn.compareTo(b2.getIsbn());
		//int diff = this.authorname.compareTo(b2.getAuthorname());
		return diff;
	}
}

//	@Override
//	public int compareTo(Bookkkk b) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	}
