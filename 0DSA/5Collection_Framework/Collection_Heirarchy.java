// package 0DSA.5Collection_Framework;

public class Collection_Heirarchy {
    
}






/*


Iterable        // root
   |
Collection      // root
   |
--------------------------------
|              |             |
List          Set          Queue
|
ArrayList
LinkedList
Vector
Stack

Set
|
HashSet
LinkedHashSet
TreeSet

Map (Separate Hierarchy)
|
HashMap
LinkedHashMap
TreeMap
Hashtable



*/



/*
ArrayList
LinkedList
HashSet
TreeSet
HashMap
TreeMap
Queue
PriorityQueue
Stack


*/





/*

if there is any interface we can not directly create object of that interface 
but we can create reference of that interface 
and we can assign the object of class which implements that interface to that reference.


Collection -------- List ( Interface - abstract class) -------- ArrayList(concrete class)
Collection -------- Set  -------- HashSet

**abstract class can have both abstract and non-abstract methods,
 but *** concrete class can have only non-abstract methods.

 ***abstact methods- we can not create object of abstract class
                    but we can create reference of abstract class
                    and we can assign the object of concrete class to that reference

 ***non abstract methods- we can create object of concrete class
                    and we can create reference of concrete class
                    and we can assign the object of concrete class to that reference

diffrence :     abstract class can have both abstract and non-abstract methods,
              concrete class can have only non-abstract methods






*/