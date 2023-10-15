package Assignment_02_1;

public class Test_Invoice {
 public static void main(String[] args) {
	 
	// Invoice i=new Invoice("101","ABC",10,10.5);
	 //i.displaydata();
	// System.out.println("Calculate amount = "+i.calculateAmount());
	 Invoice i1 = new Invoice();
	i1.acceptdata();
	i1.displaydata();
	 System.out.println("Calculate amount = "+i1.calculateAmount());

}
}
