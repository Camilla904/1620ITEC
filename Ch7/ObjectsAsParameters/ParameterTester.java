
public class ParameterTester
{
//----------------------------------------------------------------- 
// Sets up three variables (one primitive and two objects) to
// serve as actual parameters to the changeValues method.
// Prints their values before and after calling the method. 
//----------------------------------------------------------------- 
  public static void main(String[] args)
  {
    ParameterModifier modifier = new ParameterModifier();
    int a1 = 111;
    Num a2 = new Num(222); 
    Num a3 = new Num(333);
    System.out.println("Before calling changeValues:"); 
    System.out.println("a1\ta2\ta3"); //header labels 
    System.out.println(a1 + "\t" + a2 + "\t" + a3 + "\n");
    modifier.changeValues(a1, a2, a3);
    System.out.println("After calling changeValues:"); 
    System.out.println("a1\ta2\ta3"); //header labels 
    System.out.println(a1 + "\t" + a2 + "\t" + a3 + "\n");
   } 
}

------------------------------------------------
  
public class ParameterModifier {
//----------------------------------------------------------------- 
// Modifies the parameters, printing their values before and
// after making the changes. 
//----------------------------------------------------------------- 
  public void changeValues(int f1, Num f2, Num f3)
  {
    System.out.println("Before changing the values:"); 
    System.out.println("f1\tf2\tf3"); //header labels 
    System.out.println(f1 + "\t" + f2 + "\t" + f3 + "\n");
    f1 = 999;
    f2.setValue(888);
    f3 = new Num(777); //NUM: a class representing sigle int object
    System.out.println("After changing the values:"); 
    System.out.println("f1\tf2\tf3"); //header labels 
    System.out.println(f1 + "\t" + f2 + "\t" + f3 + "\n");
  }
}  

---------------------------------------------------
  
public class Num
{
   private int value;
//----------------------------------------------------------------- 
// Sets up the new Num object, storing an initial value. 
  //----------------------------------------------------------------- 
  public Num(int update)
  {
    value = update;
  }

//----------------------------------------------------------------- 
// Sets the stored value to the newly specified value. 
//----------------------------------------------------------------- 
  public void setValue(int update)
  {
    value = update;
  }
//----------------------------------------------------------------- 
// Returns the stored integer value as a string. 
//----------------------------------------------------------------- 
  public String toString()
  {
    return value + "";
  } 
}


