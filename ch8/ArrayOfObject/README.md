# Arrays of Objects
## An array of objects is really an array of object references.
- The following declaration reserves space to store 5 references to String objects.  
        String[] words = new String[5];
- Initially an array of objects holds null references. 
- Each object stored in an array must be instantiated separately.

### String objects can be created using literals. 
- The following declaration creates an array object called verbs and fills it with four String objects
created using string literals.  
    String[] verbs = {"play", "work", "eat", "sleep", "run"};
