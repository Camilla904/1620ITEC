
public class GradeRange
{
//----------------------------------------------------------------- 
// Creates an array of Grade objects and prints them.
//----------------------------------------------------------------- 
  public static void main(String[] args)
  {
   Grade[] grades =
   {
    new Grade("A", 95), new Grade("A-", 90),new Grade("B+", 87), 
    new Grade("B", 85), new Grade("B-", 80), new Grade("C+", 77), 
    new Grade("C", 75), new Grade("C-", 70), new Grade("D+", 67), 
    new Grade("D", 65), new Grade("D-", 60), new Grade("F", 0)
    };
    
    for (Grade letterGrade : grades) 
    System.out.println(letterGrade);
    // Print each Grade object grades array;
    // the var letterGrade takes the value of each Grade object
    // in the array in turn, and the body of the loop process it.
    // for each letterGrade in grades array, print the letterGrade
   }
 }
 
 
 ------------------------------------------
 
public class Grade
{
    private String name; 
    private int lowerBound;
    //----------------------------------------------------------------- 
    // Constructor: Sets up this Grade object with the specified
    // values for the grade name and numeric lower bound. 
    //----------------------------------------------------------------- 
    public Grade(String grade, int cutoff)
    {
      name = grade;
      lowerBound = cutoff;
     }
     //----------------------------------------------------------------- 
     // Returns a string representation of this grade 
     //----------------------------------------------------------------- 
     public String toString()
     {
     return name + "\t" + lowerBound;
     }
     
     //----------------------------------------------------------------- 
     // Name mutator. 
     //----------------------------------------------------------------- 
     
     public void setName(String grade)
     {
        name = grade;
     }
     //----------------------------------------------------------------- 
     // Lower bound mutator. 
     //----------------------------------------------------------------- 
     public void setLowerBound(int cutoff)
     {
        lowerBound = cutoff;
     }
    //----------------------------------------------------------------- 
    // Name accessor. 
    //----------------------------------------------------------------- 
    
    public String getName()
   {
      return name;
   }
   
   //----------------------------------------------------------------- 
   // Lower bound accessor. 
   //----------------------------------------------------------------- 
   
   public int getLowerBound()
   {
      return lowerBound;
   }
 } 
     
     
     
     

     
