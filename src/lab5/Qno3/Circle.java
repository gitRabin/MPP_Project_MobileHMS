package lab5.Qno3;

public final class Circle implements Shape
{
private double r;
	
	Circle(double rad)
	{
		this.r=rad;
	}
	@Override
	public double computeArea()
	{
		return Math.PI*r*r;
	}
	public double getR() {
		return r;
	}

}
