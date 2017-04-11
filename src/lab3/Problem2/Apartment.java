package lab3.Problem2;

public class Apartment {

	private int ApartmentNumber;
	private Double MonthlyRent;

	Apartment(int apartmentNo, Double rent) {
		this.ApartmentNumber = apartmentNo;
		this.MonthlyRent = rent;
	}

	public Double getRent()
	{
		return MonthlyRent;
	}
	public int gerApartmentNumber()
	{
		return ApartmentNumber;
	}
}
