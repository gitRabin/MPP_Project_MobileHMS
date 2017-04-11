package lab3.Problem3_b;

public class MainClass 
{
	public static void main(String[] str)
	{
		Circle circle1=new Circle();
		System.out.println(circle1);
		
		Circle circle2=new Circle(2.0);
		System.out.println(circle2);
		
		
		
		Cylinder c1=new Cylinder();
		System.out.println("Volume of c :"+c1.getVolume());
		
		Cylinder c2=new Cylinder(2.0);
		System.out.println("Volume of c2 :"+c2.getVolume());
		
		Cylinder c3=new Cylinder(2.0,2.0);
		System.out.println("Volume of c3 :"+c3.getVolume());
		
		
		
	}
}
