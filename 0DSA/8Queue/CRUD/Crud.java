// package 0DSA.8Queue.CRUD;

 import java.util.*;

 public class Crud {
    // Queue<String> queue = new Queue<String>();
    // it will say queue can not be resolved to a type.
    // because queue is actually an interface and we can not create an object of an interface
    // interface is like a template, we can not create an instance of any interface. instead we can apply these template to another class.

    
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();   // Create

        // Enqueue (Add)
        queue.add("Kanchan");
        queue.add("Kapri");
        queue.add("AI");

        // Read (Peek)
        System.out.println("Front element: " + queue.peek());

        // Dequeue (Remove)
        System.out.println("Removed: " + queue.poll());

        // Display remaining
        System.out.println("Queue after removal: " + queue);
    }

}



/*


🧩 Queue in Java
Queue is an interface in java.util.

Common implementations:

LinkedList → dynamic size, fast insert/remove.

ArrayDeque → resizable array, efficient for both ends.

PriorityQueue → elements ordered by priority.



*/






/*



Queue → An interface in Java that defines FIFO behavior (First In, First Out).

<String> → A generic type parameter. It means this queue will only store String objects.

queue → The variable name you chose to represent the queue object in memory.

= → The assignment operator. It connects the variable on the left with the object created on the right.

new → Creates a new object in memory.

LinkedList → A concrete class that implements the Queue interface. It provides the actual functionality.

<> → The diamond operator. It tells Java to infer the generic type (String) from the left side, so you don’t have to repeat it.

() → Calls the constructor of LinkedList. Since no arguments are passed, it uses the default constructor to create an empty list.





*/