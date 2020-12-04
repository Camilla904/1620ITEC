package Slogan;

public class Slogan {
	private String pharse;
	private static int count = 0; // Don't forget assign value & modifier without final

	
	public Slogan (String str)
	{
		pharse = str; //This can replace str 
		count++; //Don't forget iterate count variable here
	}
	
	public String toString() {  //repo for string, so this method doesn't work
		return pharse;
	}
	
	public static int getCount() {   //Don't forget the static modifier 
		return count;
	}

}
