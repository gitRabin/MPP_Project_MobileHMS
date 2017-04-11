package lab5.Qno2;



public class MainClass {

	public static void main(String[] args)
	{
    Duck[] listOfDuck={new MallardDuck(),new DecoyDuck(),new RedheadDuck(),new RubberDuck()};
   
    for(Duck d: listOfDuck)
    {
    	//System.out.println(d.getClass().getSimpleName());
    	d.display();
    	d.fly();
    	d.quack();
    	d.swim();
    }
		
		
	}

}
