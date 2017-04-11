package lab3.Problem1_1;

/**
 * 
 * Description :
1. Since the some issue of using Inheritance, 
*solving the problem using the concept of ASSOCIATION
*for this: we add the Person class object itself inside the class PersonWithJOb.
*Because, each PersonWithJob is itself a Person

*so we removed Inheritance and used Association as follows
*/
public class PersonWithJob {

	private double salary;
	// using the Association concept
	private Person person;

	public double getSalary() {
		return salary;
	}

	PersonWithJob(String n, double s) {
		person = new Person(n);
		salary = s;
	}

	@Override
	public boolean equals(Object aPerson) {
		if (aPerson == null)
			return false;
		if (!(aPerson instanceof PersonWithJob))
			return false;
		PersonWithJob p = (PersonWithJob) aPerson;
		boolean isEqual = this.getSalary() == p.getSalary() && this.person.equals(p.person);
		return isEqual;
	}

	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
		
		PersonWithJob person1=new PersonWithJob("Rabin",150000 );
		PersonWithJob person2=new PersonWithJob("Rabin",150000 );
		
		System.out.println("person1.equals(person2)? " + person1.equals(person2));
		System.out.println("person2.equals(person1)? " + person2.equals(person1));
		
		person1.person=new Person("Niroj");
		System.out.println("After person object Changed");
		System.out.println("person1.equals(person2)? " + person1.equals(person2));
		System.out.println("person2.equals(person1)? " + person2.equals(person1));
		
		System.out.println("if p2.equals(new Person(\"Joe\")==>"+p2.equals(new Person("Joe")));
		
	}

}
