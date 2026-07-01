public class stringlitrals_case_sensitive {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "hello";

        // is the string created by string litrals case sensitive or not?
        System.out.println(s1.equals(s2)); // Output: false (because of case sensitivity)
        System.out.println(s1.equalsIgnoreCase(s2)); // Output: true (ignoring case sensitivity)
        System.out.println(s1 == s2); // Output: false (because they are different string literals in the string pool but both referencing same content but different memory location)


        // both refrencing to the same content but How the diffrente location?

        // ans : because of case sensitivity the string literal "Hello" and "hello" are treated as different literals in the string pool,
        //  so they are stored at different memory locations.


        

    }
}