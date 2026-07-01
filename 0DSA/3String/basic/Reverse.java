package basic;

public class Reverse {
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(); // Using StringBuilder for efficient string concatenation
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    public static void main(String[] args) {
        String str = "Hello World";
        String reversed = reverseString(str);
        System.out.println("Reversed String: " + reversed);
    }
}



/*




static String reverseString(String str) {
    String reversed = "";
    for (int i = str.length() - 1; i >= 0; i--) {
        reversed += str.charAt(i);  // charat meanse get character at index i
        reversed = reversed + str.charAt(i); // Concatenating characters in reverse order
        }
        return reversed;
    } 











*/