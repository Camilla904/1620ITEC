
public class VariableParameters
{
//----------------------------------------------------------------- 
// Creates two Family objects using a constructor that accepts
// a variable number of String objects as parameters. 
//----------------------------------------------------------------- 

public static void main(String[] args)
{
Family lewis = new Family("John", "Sharon", "Justin", "Kayla",
"Nathan", "Samantha");
Family camden = new Family("Stephen", "Annie", "Matt", "Mary", "Simon", "Lucy", "Ruthie", "Sam", "David");
System.out.println(lewis); 
System.out.println(); 
System.out.println(camden);
} 
}
----------------

public class Family
{
   private String[] members;
//----------------------------------------------------------------- 
// Constructor: Sets up this family by storing the (possibly multiple) names that are passed in as parameters. 
//----------------------------------------------------------------- 
public Family(String ... names)
   {
      members = names;
   }

//----------------------------------------------------------------- 
// Returns a string representation of this family. 
//----------------------------------------------------------------- 
public String toString()
   {
      String result = "";
      for (String name : members)
         result += name + "\n";
         return result; }
}






