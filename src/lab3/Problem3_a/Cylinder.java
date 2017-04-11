package lab3.Problem3_a;

public class Cylinder extends Circle {
	private double height;

	public Cylinder()
	{
		super(1.0);
		this.height = 1.0;
	}

	public Cylinder(double r) 
	{
		super(r);
		this.height = 1.0;
	}
	public Cylinder(double r,double h) 
	{
		super(r);
		this.height = h;
	}
	public double getHeight()
	{
		return this.height;
	}
	public double getVolume()
	{
		return super.getArea()*this.getHeight();  //volume= pi * r *r * h;
	}

	
}
