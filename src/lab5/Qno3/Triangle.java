package lab5.Qno3;

public final class Triangle implements Shape {
	private double base;
	private double height;

	Triangle(double b, double h) {
		this.base = b;
		this.height = h;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public double computeArea() {
		return base * height / 2;
	}

}
