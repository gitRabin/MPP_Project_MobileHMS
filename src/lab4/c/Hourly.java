package lab4.c;
class Hourly extends Employee {
	double hourlyWage;
	double hoursPerweek;

	Hourly(String eid, double hw, double hpw) {
		super(eid);
		this.hourlyWage = hw;
		this.hoursPerweek = hpw;
	}

	@Override
	double calcGrossPay(int month,int year)
	{
		// we considerd there are 4 week in a month
		return this.hourlyWage * this.hoursPerweek * 4;
	}
}
