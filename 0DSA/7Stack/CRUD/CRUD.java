// package 0DSA.7Stack.CRUD;


import java.util.*;
public class CRUD {
    // Last in First out 
    // in stacks we use LIFO

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        System.out.println(stack.empty()); // true

        stack.push("Ashiqa");
        stack.push("Gujan");
        stack.push("Pooja");
        stack.push("Anjali");
        stack.push("Neha"); 

        System.out.println("HAHAHHAH, These are some of the Beautiful Ladies");
   


        System.out.println(stack.empty()); // false
        System.out.println(stack);



        // Removing some Elements
        stack.pop();  // it will remove what is in the top 
        System.out.println(stack);

 
        // Updating the element
        stack.set(0, "ishu");

        System.out.println(stack); // [ishu, Gujan, Pooja, Anjali]


        // Searching the element
        System.out.println(stack.search("Pooja")); // 2
        // if some values are not present in the stack then it will return -1

        // Peeking the element
        System.out.println(stack.peek()); // Neha

        // Deleting the element
        stack.remove(1);  // it will remove the element at index 1 
        System.out.println(stack);  // [Ashiqa Gujan, Anjali]

        // output is [Ashiqa Gujan, Anjali]




        // Pop vs Remove
        // Pop will remove the top element of the stack
        // Remove will remove the element at the given index

   
        // time complexity diffrenece in remove vs pop
        // pop is O(1) and remove is O(n)
        // because in remove we have to shift the elements after the removed element




        for(int i=0; i<stack.size(); i++ ){
            stack.push("kanchan");
            System.out.println(stack.get(i));
        }

    }

    
}
