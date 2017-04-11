package lab4.c;

final class Paycheck {
	private double grossPay=0.0;
	private  double fica=0.0;
	private  double state=0.0;
	private  double local=0.0;
	private  double medicare=0.0;
	private  double socialSecurity=0.0;
	Paycheck(double grosssal)
	{
		this.grossPay=grosssal;
		this.fica = grosssal * 23 / 100;
		this.state = grosssal * 5 / 100;
		this.local = grosssal * 1 / 100;
		this.medicare = grosssal * 3 / 100;
		this.socialSecurity = grosssal * 7.5 / 100;			
		
		
	}
	
	void print()
	{
		System.out.println("## They paycheck Information ##");
		System.out.println("\nGross Payment :"+this.grossPay);
		System.out.println("\nFederal Insurance Contributions :"+this.fica);
		System.out.println("\nState Tax :"+this.state); 
		System.out.println("\nLocal tax :"+this.local);
		System.out.println("\nMedicare tax :"+this.medicare);
		System.out.println("\nSocial Security :"+this.socialSecurity);
		System.out.println("\nNet payment :"+getNetPay()+"\n");
	}
	double getNetPay()
	{
		return this.grossPay-(fica+state+local+medicare+socialSecurity); 
	}

}