// package 0DSA.5Collection_Framework;

public class Array_vs_Arraylist {

    // 
    
}



/*

First Think Like an Engineer---->

Before choosing a data structure ask:

Question 1

Do I know the size beforehand?

Yes → Array
No → ArrayList

why - Arrays have a fixed size, while ArrayLists can grow and shrink dynamically.
how - If you know the size of your data in advance, using an array can be more efficient in terms of memory and performance. 
      If the size is unknown or can change, an ArrayList is more flexible and easier to work with.

----------------------------------------------------------
Question 2

Do I need maximum performance?

Yes → Array
No → ArrayList

why - Arrays are faster than ArrayList
How - ArrayList is a wrapper class around an array, so it has some overhead.
      like - ArrayList has to check for capacity, resize the array, 
      and copy elements when it grows beyond its current capacity. 
      This adds some overhead compared to a simple array.
---------------------------------------------------------
Question 3

Do I need to keep adding/removing elements dynamically?

Yes → ArrayList
No → Array

why - ArrayList is designed to handle dynamic resizing, 
      while arrays have a fixed size once they are created. 
      If you need to add or remove elements frequently, 
      an ArrayList is more convenient and efficient.
how - ArrayList automatically resizes itself when elements are added or removed, 
      while arrays require manual resizing and copying of elements.


*/