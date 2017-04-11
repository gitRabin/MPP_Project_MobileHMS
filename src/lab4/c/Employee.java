package lab4.c;

public abstract class Employee {
	String empid;

	Employee(String id) {
		this.empid = id;
	}
 void print()
 {
	 System.out.println("\n## Person Id :"+this.empid +"##");
		Paycheck pychk= calcCompensation(0, 0); // we no
		pychk.print(); // printing all the details of paycheck
	 
 }
	void print(int month,int year)
	{
		System.out.println("## Person Id :"+this.empid +"##");
		Paycheck pychk= calcCompensation(month, year);
		pychk.print(); // printing all the details of paycheck
		
	}

	Paycheck calcCompensation(int month, int year)
	{
		double grosssal = calcGrossPay( month,year);			
	   
		Paycheck paycheck=new Paycheck(grosssal);
		return paycheck;
	}

	// to be implemented by its sub class
	abstract double calcGrossPay(int month,int year);
}
