# Interfaces 
- An interface is a completely **"abstract class"** that is used to group related methods with empty bodies.
- An abstract method is a method header without a method body
- A Java interface is a collection of abstract methods and constants
- An interface cannot be **instantiated**
-  Methods in an interface have **public visibility by default**
- If a class declares that it implements an interface, it must define **all methods** in the interface.
- In addition to (or instead of) abstract methods, an interface can contain constants When a class implements an interface, it gains access to all its constants
----
- A class can implement multiple interfaces
- The class must implement all methods in all interfaces listed in the header
---
 - The String class implements Comparable,giving us the ability to put strings in lexicographic order
 - An iterator is an object that provides a means of processing a collection of objects one at a time

An iterator is created formally by implementing the Iterator interface, which contains three methods: 
1. The ***hasNext*** method returns a boolean result – true if there are items left to process
2. The ***next*** method returns the next object in the iteration
3. The ***remove*** method removes the object most recently returned by the next method
