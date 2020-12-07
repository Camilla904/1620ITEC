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
