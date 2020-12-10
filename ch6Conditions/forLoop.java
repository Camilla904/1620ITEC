
import java.util.Scanner;

public class Multiples
{
//----------------------------------------------------------------- 
// Prints multiples of a user-specified number up to a user specified limit. 
//----------------------------------------------------------------- 
  
  public static void main(String[] args)
  {
    final int PER_LINE = 5;
    int value, limit, mult, count = 0;
    
    Scanner scan = new Scanner(System.in); 
    
    System.out.print("Enter a positive value: ");
    value = scan.nextInt(); //e.g. 7
    
    System.out.print("Enter an upper limit: "); 
    limit = scan.nextInt(); //e.g. 400
    
    System.out.println();
    System.out.println("The multiples of " + value + " between " +
                       value + " and " + limit + " (inclusive) are:");
    for (mult = value; mult <= limit; mult += value) 
    {
      System.out.print(mult + "\t");  // Print a specific number of values per line of output
      count++;
      if (count % PER_LINE == 0) // e.g 1st iteration: 1%5= 0.2 !=0 // set new mult to 7(mult)+7(value)
        System.out.println();
    } 
  }
}

---------------------------------------------------------------------------------------------------------------
  
  
public class Stars
{
//----------------------------------------------------------------- 
// Prints a triangle shape using asterisk (star) characters. 
//----------------------------------------------------------------- 
  
  public static void main(String[] args)
  {
    final int MAX_ROWS = 10;
    for (int row = 1; row <= MAX_ROWS; row++) 
    {
      for (int star = 1; star <= row; star++) 
        System.out.print("*");
      
      System.out.println();
    }
  } 

}





