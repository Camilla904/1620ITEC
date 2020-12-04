package Slogan;

public class SloganCounter {

	public static void main (String[] argc)
	{
		Slogan slogans;
		slogans = new Slogan("Remember the Alamo");
		System.out.println(slogans);
		
		slogans = new Slogan("Don't worry. Be happy");
		System.out.println(slogans);
		
		slogans = new Slogan("Live Free or Die.");
		System.out.println(slogans);
		
		slogans = new Slogan("Talk is Cheap.");
		System.out.println(slogans);
		
		slogans = new Slogan("Write Once, Run Anywhere.");
		System.out.println(slogans);
		
		System.out.println();
		System.out.println("Slogan created: " + Slogan.getCount());
		
		/* ------  Because instance data is created only when an object is created.
		   ------- You don't need an object to execute a static method
		 */
		
	}
}
