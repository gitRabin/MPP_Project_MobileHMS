package lab5.Qno3;

public final class Rectangle implements Shape {
	private double height;
	private double width;

	Rectangle(double h, double w) {
		this.height = h;
		this.width = w;
	}

	@Override
	public double computeArea()
	{
		return this.height*this.width;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}
}
