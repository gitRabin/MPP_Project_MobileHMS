package lab4.c;

class Salaried extends Employee {
	double salary;

	Salaried(String eid, double sal) {
		super(eid);
		this.salary = sal;
	}

	@Override
	double calcGrossPay(int month,int year) 
	{
		return this.salary;
	}

}
