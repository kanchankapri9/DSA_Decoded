public class Refrence_Shifting {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1; // s2 is referencing the same string object as s1

        System.out.println(s1); // Output: Hello
        System.out.println(s2); // Output: Hello

        s1 = "World"; // Now s1 is referencing a new string object "World"

        System.out.println(s1); // Output: World
        System.out.println(s2); // Output: Hello (s2 still references the original string "Hello")
    }

}


/* 


==                      :            actual address refrencing or not?

.equals() method in Java:            actuall content same or nnot?
                                    it is case sensitive method. ( if letter in uppercase and other in lowercase then it will return false)


.equalsIgnoreCase() method in Java:     actuall content same or nnot?
                                    it is not case sensitive method. ( if letter in uppercase and other in lowercase then it will return true)     



                                    

*/

