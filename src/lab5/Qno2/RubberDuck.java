package lab5.Qno2;

public class RubberDuck extends Duck {

	
	RubberDuck()
	{
		super.flyingduck=new CannotFly(); //
		super.quackingduck=new Squeak(); // since rubberDuck squeaks
	}
	@Override
	void display() {
	
		System.out.println("Rubber Duck :"); 
		System.out.println("   Displaying ");
	}

}
