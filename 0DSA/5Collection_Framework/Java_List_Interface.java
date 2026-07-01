// the  java 's List interface is a part of the Java Collections Framework. 
// It provides a way to store an ordered collection of elements, allowing for duplicate entries. 
// The List interface extends the Collection interface and provides additional methods for manipulating elements based on their index positions.'


//Java ArrayList : 


//the ArrayList class is a resizable array implementation of the List interface.
//  It allows for dynamic resizing, meaning that it can grow or shrink in size as elements are added or removed.
//  The ArrayList class provides methods for adding, removing, and accessing elements based on their index positions. 
// It also allows for duplicate entries and maintains the order of elements as they are added to the list.


// list or collection are interfaces there actual implementation of the list interface is arraylist, linkedlist, vector, stack etc.
// we can not creat an object of the list interface but we can create an object of the arraylist class and assign it to the list interface reference variable.

// this is simply in simple term we can not create an object of the list interface but we can create an object of the arraylist class and assign it to the list interface reference variable.

import java.util.ArrayList;  // this is the implementation of the list interface , a part of the java collections framework , we importing this class to use it in our program.

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();// here refrence is concreate class and object is also of the same class.
        List<String> fruitsList = new ArrayList<>(); //  here refrence is abstract class and object is also of the same class ,we can also create an object of the arraylist class and assign it to the list interface reference variable.
        Collection<String> fruitsCollection = new ArrayList<>(); // here refrence is abstract class and object is also of the same class we can also create an object of the arraylist class and assign it to the collection interface reference variable.

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Display the elements in the ArrayList
        System.out.println("Fruits List: " + fruits);

        // Access an element by index
        String firstFruit = fruits.get(0); // same as indexing
        System.out.println("First fruit: " + firstFruit);

        // Remove an element by index
        fruits.remove(2); // Removes "Cherry"
        System.out.println("After removing Cherry: " + fruits);

        // Check if the list contains a specific element
        boolean hasBanana = fruits.contains("Banana");
        System.out.println("Contains Banana? " + hasBanana);

        // Get the size of the ArrayList
        int size = fruits.size();
        System.out.println("Size of the list: " + size);


         // printing the array after making arraylist into array using toArray() method of the collection interface.
         Object[] fruitsArray = fruits.toArray(); // this will return an array of objects , array
            System.out.println("Fruits Array: ");
            for (Object fruit : fruitsArray) {
                System.out.println(fruit);
            }

        // Clear the ArrayList
        fruits.clear();
        System.out.println("After clearing the list: " + fruits);

       


        // to array
        //whatever the type of the list is arraylist or linkedlist or vector or stack 
        // we can convert it to array using toArray() method of the collection interface.

        fruits.toArray(); // this will return an array of objects , array of objects meanse that the type of the array will be Object[] , we can also specify the type of the array using toArray(T[] a) method of the collection interface.

    }
}


/*


Methods that are present in all of the collection framework are :
1. add(E e) : This method is used to add an element to the collection. E represents the type of elements in the collection. It returns true if the element was added . and e is the element to be added to the collection.
2. remove(Object o) : This method is used to remove a specific element from the collection. It returns true if the element was removed successfully, and false if the element was not found in the collection. The parameter o is the element to be removed from the collection.
3. contains(Object o) : This method is used to check if a specific element is present in the collection. It returns true if the element is found, and false otherwise. The parameter o is the element to be checked for presence in the collection.
4. size() : This method is used to get the number of elements in the collection. It returns an integer representing the size of the collection.
5. clear() : This method is used to remove all elements from the collection, leaving it empty. After calling this method, the size of the collection will be zero.
6. iterator() : This method is used to obtain an iterator for the collection. An iterator is an object that allows you to traverse through the elements of the collection one by one. The iterator() method returns an instance of the Iterator interface, which provides methods for iterating over the collection, such as hasNext() and next().
7. isEmpty() : This method is used to check if the collection is empty. It returns true if the collection contains no elements, and false otherwise.
8. addAll(Collection<? extends E> c) : This method is used to add all elements from a specified collection to the current collection. The parameter c is the collection containing the elements to be added. It returns true if the collection was modified as a result of the operation.
9. removeAll(Collection<?> c) : This method is used to remove all elements from the current collection that are also present in the specified collection. The parameter c is the collection containing the elements to be removed. It returns true if the collection was modified as a result of the operation.


*/
