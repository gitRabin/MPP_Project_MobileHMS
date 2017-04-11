package lab3.Problem1_returnsTrue;

public class PersonWithJob
{

	private double salary;
	
	Person person;

	public double getSalary() {
		return salary;
	}

	PersonWithJob(String n, double s)
	{
		person=new Person(n);
		salary = s;
	}

	@Override
	public boolean equals(Object aPerson) {
		if (aPerson == null)
			return false;
		if (!((aPerson instanceof PersonWithJob)||(aPerson instanceof Person)))
			return false;
		if(aPerson instanceof PersonWithJob)
		{
		PersonWithJob pwithjob = (PersonWithJob) aPerson;		
		return this.person.getName().equals(pwithjob.person.getName()) && this.getSalary() == pwithjob.getSalary();
		
		}
		else
		{
			Person pn = (Person) aPerson;		
			return this.person.getName().equals(pn.getName());
			
		}
		
	}

	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		// As PersonsWithJobs, p1 should be equal to p2
		
		/* note : here p1 is instance of PersonWithJOb, which is also the instance of person
		 * and p2 is instance of person	but not the instanceOf PersonWithJOb	 * 
		 */
		System.out.println("p1.equals(p2)? " + p1.equals(p2)); 
		/* it gives false as it is calling PersonWithJob Class's 
		 * equals method and here passed object p2 is not a instance
		 *  of PersonWithJOb, hence returns false
		*/
		System.out.println("p2.equals(p1)? " + p2.equals(p1)); 
		/* it is true as is calling person class's equals() 
		*method which is comparing only name and they are same
		*/
	}

}
