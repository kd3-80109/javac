
public class SalariedEmp extends Employee
{
	private double weeklySalary;

	public SalariedEmp() {
	
	}

	public SalariedEmp(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	public double CalculateSalary() {
		return this.weeklySalary;
	}
}
