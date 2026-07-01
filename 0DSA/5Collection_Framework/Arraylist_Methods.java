// package 0DSA.5Collection_Framework;

import java.util.ArrayList;

public class Arraylist_Methods {
    public static void main(String[] args) {
    // sort method
    ArrayList<Integer> List = new ArrayList<>();
        List.add(5);
        List.add(2);
        List.add(8);
        List.add(1);
        List.add(4);

        System.out.println("Before sorting: " + List);

        java.util.Collections.sort(List);

        System.out.println("After sorting: " + List);
    


    // sorting in descending order 
    java.util.Collections.sort(List, java.util.Collections.reverseOrder());

    


    
    // contains method


    //isEmpty method


    //clone
    // it creates the shallow copy of the arraylist and returns the reference of the new arraylist.
    ArrayList<Integer> List2 = (ArrayList<Integer>)List.clone();
    System.out.println("Cloned list: " + List2);

    //ensureCapacity
    // it increases the capacity of the arraylist to the specified minimum capacity if it is necessary.
        List.ensureCapacity(10);
        System.out.println("Capacity ensured for 10 elements.");
        // incresing the capacity of the arraylist to 20
        List.ensureCapacity(20);
        System.out.println("Capacity ensured for 20 elements.");

        //indexOf
        int index = List.indexOf(4);
        System.out.println("Index of 4: " + index);
        // if the element is not found in the arraylist it will return -1
    
        //lastIndexOf
        List.add(4); // is added at the end of the arraylist
        int lastIndex = List.lastIndexOf(4);
        System.out.println("Last index of 4: " + lastIndex);



    }

}
