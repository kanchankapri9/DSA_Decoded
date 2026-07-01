public class New_Keyword {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        // by new keyword
        String s3 = new String("Hello");

        // The diffrence
        System.out.println(s1 == s2); // true  // meaning s1 and s2 are referencing the same string literal "Hello" in the string pool
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s3); // false  // meaning s1 and s3 are different objects in memory
        System.out.println(s1.equals(s3)); // true // meaning s1 and s3 have the same content "Hello"

        // 
}
}


// ==   vs equals() method in Java:

// The == operator checks for reference equality, meaning it checks if two references point to the same object in memory.

// The equals() method checks for value equality, meaning it checks if the content of the objects is the same.
