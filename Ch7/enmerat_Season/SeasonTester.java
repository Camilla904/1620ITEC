package enmerat_Season;

public class SeasonTester {
	
	public static void main(String[] args) {
		// values() is a static method that returns all possible values 
		// of that type; since this list is an iterator, we can use the 
		// for loop to cycle through it
		
		// for each season in the list (time), print the value and string
		for(Season time : Season.values()) {
			System.out.println(time + "\t" + time.getSpan());
		}
		
	}

}
