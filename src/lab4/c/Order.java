package lab4.c;

import java.time.LocalDate;

class Order {
	int orderNo;
	LocalDate orderDate;
	double OrderAmount;

	Order(int orderno, LocalDate date, double orderamount)
	{
		this.orderNo = orderno;
		this.orderDate = date;
		this.OrderAmount = orderamount;
	}

}
