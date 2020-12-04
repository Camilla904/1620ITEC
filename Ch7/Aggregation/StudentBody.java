package Aggregation;

public class StudentBody {
	
	public static void main (String[] args) {
		
		Address chome = new Address("the Pond","Toronto","On",3000);
		Address school  = new Address("the Pond","Toronto","On",9000);
		Address ahome  = new Address("the Pond","Toronto","On",10000);
		
		Student camilla = new Student("Camilla","Yu",chome,school);
		Student alice = new Student("Alice","Yu",ahome,school);

		System.out.println(camilla);
		System.out.println(alice);
	}

}
