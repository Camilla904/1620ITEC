
public class Messages
{
//----------------------------------------------------------------- 
// Creates two objects and invokes the message method in each. 
//----------------------------------------------------------------- 
   
   public static void main(String[] args)
   {
      Thought parked = new Thought();
      Advice dates = new Advice();
      
      parked.message();
      dates.message(); // overridden
   }
}

-----------------------------------------------------------------
public class Thought
   {
      //----------------------------------------------------------------- 
      // Prints a message. 
      //----------------------------------------------------------------- 
      public void message()
      {
         System.out.println("I feel like I'm diagonally parked in a " + "parallel universe.");
         System.out.println(); 
      }
       
public class Advice extends Thought

{
//----------------------------------------------------------------- 
// Prints a message. This method overrides the parent's version. 
//----------------------------------------------------------------- 
   public void message() // method override
   {
      System.out.println("Warning: Dates in calendar are closer " + "than they appear."); 
      System.out.println();
      super.message(); // explicitly invokes the parent's version 
   }
}









