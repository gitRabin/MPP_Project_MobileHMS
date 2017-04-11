package lab3.Problem2;

import java.util.ArrayList;
import java.util.Arrays;

public class Landlord 
{
	private String Name;

	private ArrayList<Building> ownedBuildingList;
	/*this ensures that each land lord owns at least one building*/
	Landlord(String name,Building firstBuilding) 
	{
		ownedBuildingList=new ArrayList<Building>();
		this.Name=name;
		this.addBuilding(firstBuilding);
	}
	void addBuilding(Building b)
	{
		ownedBuildingList.add(b);
	}

	public Double calculate_MonthlyProfit()
	{
		double profit=0.0;
		for(Building b: ownedBuildingList)
		{
			profit+=b.calculateProfit();
		}
		return profit;
	}

	public static void main(String[] args) 
	{
		// creating different Buildings
		Building building1=new Building(200.0,new Apartment(1,200.0));
		
		building1.addApartment(new Apartment(2,200.0));
		building1.addApartment(new Apartment(3,200.0));
		
		Building building2=new Building(200.0,new Apartment(11,200.0));
		
		building2.addApartment(new Apartment(12,200.0));
		building2.addApartment(new Apartment(13,200.0));
		
		Building building3=new Building(200.0,new Apartment(21,200.0));
		
		building3.addApartment(new Apartment(22,300.0));
		building3.addApartment(new Apartment(23,300.0));
		
		// adding add buildings into the buildingList
		Landlord landlord_1= new Landlord("Rabin",building1);		
		landlord_1.addBuilding(building2);
		landlord_1.addBuilding(building3);
		
		System.out.println("LandLord Name :"+landlord_1.Name+"\nMonthly Profit :"+landlord_1.calculate_MonthlyProfit());
		
		
		
	}

}
