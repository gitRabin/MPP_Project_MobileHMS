package lab3.Problem2;

import java.util.ArrayList;

public class Building
{
	private Double maintanceCost;
	private ArrayList<Apartment> apartmentList;
	/* ensure that a Building has atleast one apartment*/
	Building(Double maintenance,Apartment firstApartment)
	{
		apartmentList=new ArrayList<Apartment>();
		this.maintanceCost=maintenance;
		this.addApartment(firstApartment);
	}
	
	void addApartment(Apartment a)
	{
		this.apartmentList.add(a);
	}
	
	
	public Double calculateProfit()
	{
		Double revenue=0.0;
		for(Apartment a: this.apartmentList)
		{
			revenue+=a.getRent();			
		}
				
		return revenue-this.maintanceCost;
	}

}
