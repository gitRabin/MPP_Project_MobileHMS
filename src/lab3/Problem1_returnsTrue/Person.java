package lab3.Problem1_returnsTrue;

public class Person {

	private String name;

	Person(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object aPerson) 
	{
		if (aPerson == null)
			return false;
		if (!((aPerson instanceof PersonWithJob)||(aPerson instanceof Person)))
			return false;
		if(aPerson instanceof PersonWithJob)
		{
		PersonWithJob pwithjob = (PersonWithJob) aPerson;		
		return this.getName().equals(pwithjob.person.getName());		
		}
		else
		{
			Person prsn = (Person) aPerson;	
			return this.getName().equals(prsn.getName());			
		}		
		
	}

}
