package lab4.c;

import java.time.LocalDate;

public class MainClass {

	public static void main(String[] args)
	{
		Employee hourlyEmp1=new Hourly("emp-hourly-101",100.0,20.0);
		hourlyEmp1.print();
		Employee hourlyEmp2=new Hourly("emp-hourly-102",120.0,20.0);
		hourlyEmp2.print();
		
		Employee salariedEmp1=new Salaried("emp-salaried-201",7500);
		salariedEmp1.print();
		Employee salariedEmp2=new Salaried("emp-salaried-202",5500);
		salariedEmp2.print();
		
		Order order1=new Order(1,LocalDate.of(2017, 1, 11),100.0);
		Order order2=new Order(1,LocalDate.of(2017, 1, 21),100.0);
		Order order3=new Order(1,LocalDate.of(2017, 1, 22),100.0);
		Order order4=new Order(1,LocalDate.of(2016, 12, 15),100.0);
		
		Employee commissionedEmp1=new Commissioned("emp-Cmmsn-301",100.0,5);
		//adding orders to the commissioned employee
		((Commissioned) commissionedEmp1).addOrder(order1);
		((Commissioned) commissionedEmp1).addOrder(order2);
		((Commissioned) commissionedEmp1).addOrder(order3);
		((Commissioned) commissionedEmp1).addOrder(order4);
		commissionedEmp1.print(1, 2017); // Printing 
		
		Employee commissionedEmp2=new Commissioned("emp-Cmmsn-302",100.0,10);
		// adding orders to the commissioned employee
		((Commissioned) commissionedEmp2).addOrder(order2);
		((Commissioned) commissionedEmp2).addOrder(order3);
		((Commissioned) commissionedEmp2).addOrder(order4);
		
		commissionedEmp2.print(2, 2017); // see it only have 2 order in previous month 
		
		
	}

}
