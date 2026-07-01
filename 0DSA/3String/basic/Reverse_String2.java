// package basic;

public class Reverse_String2 {
    
static String reverseString(String str) {
    String reversed = "";
    for (int i = str.length() - 1; i >= 0; i--) {
        reversed += str.charAt(i);  // charAt meanse get character at index i
        // reversed = reversed + str.charAt(i); // Concatenating characters in reverse order
        }
        return reversed;
    } 


    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversedStr = reverseString(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }


}



//      (the Pluse) + in case of the string do the concatenation and in case of the number do the addition.


// is this the optiomized solution?
// No, this is not the optimized solution for reversing a string. 
// The reason is that strings in Java are immutable, 
// which means that every time you concatenate a character to the 'reversed' string,
//  a new string object is created.
//  This can lead to inefficient memory usage and slower performance, especially for long strings.