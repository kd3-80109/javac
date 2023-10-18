
public class BaseSalariedEmp extends CommissionEmp
{
	private double baseSalary;
	
	 public BaseSalariedEmp() {
		 
	 }
	 public BaseSalariedEmp(int sales,double percentage,double baseSalary) {
		
	   super(sales,percentage);
	   this.baseSalary=baseSalary;
				
	}

	 public double CalculateSalary() {
		 return super.CalculateSalary()+this.baseSalary*1.10;
	 }
}
