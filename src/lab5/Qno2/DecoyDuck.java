package lab5.Qno2;

public class DecoyDuck extends Duck {

	DecoyDuck()
	{
		super.flyingduck=new CannotFly(); // decoy duck cant fly
		super.quackingduck=new MuteQuack(); // decoy duck cant Quack
	}
	@Override
	void display() {
	
		System.out.println("Decoy Duck :");
		System.out.println("   Displaying ");
	}

	

}
