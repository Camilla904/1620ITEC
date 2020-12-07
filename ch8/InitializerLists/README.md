## initializer list
- An initializer list can be used to instantiate and fill an array in one step
- The values are delimited by braces, { }, and separated by commas
 - Examples:  
    int[] units = {147, 323, 89, 933, 540, 269, 97, 114, 298, 476};  
    char[] grades = {'A', 'B', 'C', 'D', ’F'};  
    
Note that when an initializer list is used:  
- the **new operator is not used**, 
- no size value is specified.

The size of the array is determined by the number of items in the list
– An initializer list can be used only in the **array declaration**

## Arrays as Parameters
- **An entire array can be passed as a parameter to a method**

- Like any other object, the reference to the array is passed, making the formal and actual parameters aliases of each other. 
- Therefore, changing an array element within the method changes the original
- An individual array element can be passed to a method also, in which case the type of the formal parameter is the same as the element type
