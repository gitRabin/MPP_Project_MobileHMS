package lab2.Prob2B;

import java.util.ArrayList;

public class Order
{
private int orderNum;
ArrayList<OrderLine> listOfOrdersline;
Order(OrderLine firstOrderLine)
{
listOfOrdersline=new ArrayList<OrderLine>();
firstOrderLine.order1=this;
listOfOrdersline.add(firstOrderLine);
}
void addOrderLine(OrderLine ol)
{
	ol.order1=this;
	this.listOfOrdersline.add(ol);
	
}

}
