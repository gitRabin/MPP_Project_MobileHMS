package lab5.Qno3;

import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {

	public static void main(String[] args)
	{
	
		ArrayList <Shape> listOfShape= new ArrayList<Shape>(Arrays.asList(new Circle(1.0),new Rectangle(2.0,2.0),new Triangle(10.0,3.0),new Circle(2.0),new Rectangle(4.0,4.0),new Triangle(10.0,5.0)));
		double sum=0.0;
		for(Shape s: listOfShape)
		{
			//System.out.println(s.getClass().getSimpleName());
			sum+=s.computeArea();
		}
		System.out.println("Total area is :"+sum);
		
	}		
	}