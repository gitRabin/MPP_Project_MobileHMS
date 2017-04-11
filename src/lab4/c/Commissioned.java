package lab4.c;

import java.util.ArrayList;

class Commissioned extends Employee {
	double baseSalaray;
	double commission; //its in %
	ArrayList<Order> orders = new ArrayList<Order>();

	Commissioned(String id, double baseSalary,double rate) {
		super(id);
		this.baseSalaray = baseSalary;
		this.commission=rate;
		// assign commission to do
	}
	
	public void addOrder(Order o)
	{
		this.orders.add(o);
	}

	double calculateCommission(int month,int year)
	{
	if(month<0||month>12)return 0;
		double sum = 0.0;
		for (Order o : orders)
		{
			if(month==1)
			{
				month=12;
				year=year-1;
			}
			else
			{
				month=month-1;
			}
			
			if(o.orderDate.getYear()==year && o.orderDate.getMonthValue()==month)
			sum += o.OrderAmount;
		}		
		return sum*this.commission/100; 
		}

	@Override
	double calcGrossPay(int month,int year) 
	{

		return this.baseSalaray+calculateCommission(month,year); // we assumed commission rate is 10
	}
}
