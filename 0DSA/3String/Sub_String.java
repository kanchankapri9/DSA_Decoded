public class Sub_String {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String subStr = str.substring(7, 12);
        System.out.println("Substring: " + subStr); // World
    }
}




// substring(startIndex, endIndex)

// startIndex: The index of the first character to include in the substring (inclusive).

// endIndex: The index of the first character to exclude from the substring (exclusive).