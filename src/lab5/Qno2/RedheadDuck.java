package lab5.Qno2;

public class RedheadDuck extends Duck{

	RedheadDuck()
	{
		super.quackingduck=new Quack(); // Polimorphic assignment
		super.flyingduck=new FlyWithWings(); // polimorphic assignment
	}
	@Override
	void display() 
	{
		
		System.out.println("Redhead Duck :");
		System.out.println("   Displaying ");
		
	}

}
