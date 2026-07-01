public class str_equals {
    public static void main(String[] args) {
        String s1 = "Hello";  // string literal
        String s2 = "Hello"; 

        String s3 = new String("Hello"); 


        // Using '==' operator
        System.out.println("Using '==':");
        System.out.println("s1 == s2: " + (s1 == s2)); // true, because of string literal pooling
        System.out.println("s1 == s3: " + (s1 == s3)); // false, because s3 is a new object s1 is a string literal and s3 is created using 'new' keyword

        // Using 'equals()' method
        System.out.println("\nUsing 'equals()':");
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true, because content is the same
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true, because content is the same
    }
}


// We have talked about this??
//  that the string literal String class's object so string literally is object right?
//  so why the string which has been created by string and the string with " NEW " keyword  different?
//  Aren't they both objects ?


//Answer?
/*

Yes , both are objects

String literal is object and String created using "new" keyword is also an object 
but the difference is that when you create a string using a string literal, 
it is stored in a common pool of strings. 
If another string with the same content is created using a string literal, it will reference the same object in the pool.

On the other hand, when you create a string using the "new" keyword,
it creates a new object in memory, even if the content is the same as an existing
string.it does not reference the string in the pool, but instead creates a new object on the heap.
it also in the heap memory but it is not stored in the string pool, it is stored in the heap memory like any other object created using "new" keyword.


like this - 
string litral's stirng - stroed in string pool
string created using "new" keyword - stored in heap memory
*/


