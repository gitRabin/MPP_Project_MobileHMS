package lab3.Problem1_Description;

/**
* 
* Description :
1. when we are inheriting a child class from superclass, sub class can of type superclass
*  And child class can access all public and protected elements of its super class
* The object type casting is done at the runtime(Runtime polymorphism), and overridden method are called on the
* basis of instance type created at run time.
* 
2. In previous code it was PersonWithJob was inheritated from Person class: 
* And code was like :
*  PersonWithJob p1 = new PersonWithJob("Joe", 30000);
*  Person p2 = new Person("Joe");
		Here p1 is instance of PersonWithJOb, which is also the instance of person
		And p2 is instance of person but not the instanceOf PersonWithJOb
			 
	 Case1 : System.out.println("p1.equals(p2)? " + p1.equals(p2)); 
		 *it returns false as it is calling PersonWithJob Class's 
		 *equals method and here passed object p2 is not a instance
		 of PersonWithJOb, hence returns false
	 case2: System.out.println("p2.equals(p1)? " + p2.equals(p1)); 
		 *it returns true as is calling person class's equals() 
		 *method which is comparing only name and in a fact both the name are same, hence true
		 
*
*
*/

public class PersonWithJob extends Person {

	private double salary;

	public double getSalary() {
		return salary;
	}

	PersonWithJob(String n, double s) {
		super(n);
		salary = s;
	}

	@Override
	public boolean equals(Object aPerson) {
		if (aPerson == null)
			return false;
		if (!(aPerson instanceof PersonWithJob))
			return false;
		PersonWithJob p = (PersonWithJob) aPerson;
		boolean isEqual = this.getName().equals(p.getName()) && this.getSalary() == p.getSalary();
		return isEqual;
	}

	public static void main(String[] args) {
		Person p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		// As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}

}
