
public class CommissionEmp extends Employee
{
	private int sales;
	private double percentage;
	public CommissionEmp () {
		
	}
	public CommissionEmp (int sales,double percentage) {
		this.sales=sales;
		this.percentage=percentage;
	}
	public double CalculateSalary() {
	return percentage*sales;

	}
}
