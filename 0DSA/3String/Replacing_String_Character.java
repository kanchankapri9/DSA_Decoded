public class Replacing_String_Character {
    public static void main(String[] args) {
        String str = "Hello World";
        char oldChar = 'o';
        char newChar = 'x';

        String modifiedStr = str.replace(oldChar, newChar);
        System.out.println(modifiedStr); // Output: Hellx Wxrld
    }
}
