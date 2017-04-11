package lab5.Qno2;

public abstract class Duck 
{
	FlyBehavior flyingduck;
	QuackBehavior quackingduck;

void  swim()
{
	System.out.println("   Swimming");
}
void quack()
{
quackingduck.quack();	
}
// although not given in UML diagram, We need it right here
void fly()
{
flyingduck.fly();	
}

abstract void display();


}
