package lab3.Problem3_b;

public class Circle {
	private double radious;
	private final String color="red";

	public Circle() {
		this.radious = 1.0;
	}

	public Circle(double r) {
		this.radious = r;
	}
	public double getRadious()
	{
		return this.radious;
	}
	public double getArea()
	{
		return Math.PI*this.radious*this.radious;
	}
	@Override
	public String toString()
	{
		return "========================\ncolor : "+this.color+"\nRadious : "+this.getRadious()+"\nArea :"+this.getArea()+"\n========================";
	}
}
