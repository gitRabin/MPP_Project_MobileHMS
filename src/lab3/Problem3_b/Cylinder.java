package lab3.Problem3_b;

public class Cylinder {
	private double height;
	private Circle base;

	public Cylinder()
	{
		base=new Circle(1.0);
		this.height = 1.0;
	}

	public Cylinder(double r) 
	{
		base=new Circle(r);
		this.height = 1.0;
	}
	public Cylinder(double r,double h) 
	{
		base=new Circle(r);
		this.height = h;
	}
	public double getHeight()
	{
		return this.height;
	}
	public double getVolume()
	{
		return this.base.getArea()*this.getHeight();  //volume= pi * r *r * h;
	}

	
}
