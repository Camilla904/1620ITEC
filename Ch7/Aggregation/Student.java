package Aggregation;

public class Student {
	private String firstName, lastName;
	private Address homeAddress, schoolAddress;
	
	public Student (String first, String last, Address home, Address school)
	{
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		
	}
	
	public String toString () 
	{
		String fmt;
		
		fmt = firstName + " " + lastName + "\n";
		fmt += "Home Address: \n" + homeAddress + "\n";
		fmt += "School Address: \n" + schoolAddress;
		
		
		return fmt;	
	}

}
