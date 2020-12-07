### Once an array is created, it has a fixed size
- An index used in an array reference must specify a valid element – within the bounds (limits)
- if an array index is out of bounds, Java interpreter's automatic bounds checking will throw the **ArrayIndexOutOfBoundsException** indicating a
problem
- off-by-one errors are common when using arrays

- Each array object has a **public constant** called length that stores the size of the array

- It is referenced using the array name: **scores.length** //note, no ()

- Note that length holds the number of elements, not the largest index
