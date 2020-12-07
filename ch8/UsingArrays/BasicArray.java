public class BasicArray {
//----------------------------------------------------------------- 
// Creates an array, fills it with various integer values,
// multiples of 10, modifies one value, then prints them out. 
//----------------------------------------------------------------- 
 public static void main(String[] args)
 {
  final int LIMIT = 15, MULTIPLE = 10;
  
  int[] list = new int[LIMIT];

  // Initialize all of the array values
  for (int index = 0; index < LIMIT; index++)
  list[index] = index * MULTIPLE; //assign to the current index
  list[5] = 999; // change one array value ; the 6th element
  
  // Print the new array values
   for (int value : list) 
    System.out.print(value + " ");
  } 
}
