package lab5.Qno2;

public class MallardDuck extends Duck 
{

	MallardDuck()
	{
	super.quackingduck=new Quack(); // Polimorphic assignment
	super.flyingduck=new FlyWithWings(); // polimorphic assignment
	}
	
	
	@Override
	void display() 
	{
		System.out.println("MallardDuck:");
		System.out.println("   Displaying ");
	}

	

}
