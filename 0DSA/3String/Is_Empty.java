public class Is_Empty {
    public static void main(String[] args) {
        String str = "";
        String str2 = "   ";
        if (str.isEmpty()) {
            System.out.println("The string is empty.");
        } else {
            System.out.println("The string is not empty.");
        }



        // isBlank() method checks if the string is empty or contains only whitespace characters
        if (str2.isBlank()) {
            System.out.println("The string is blank.");
        } else {
            System.out.println("The string is not blank.");
        }


        // trim

        String str3 = "   Hello World!   ";
        str3.trim(); // This will not change the original string str3, because it should store the result in a new variable
        str3 = str3.trim(); // Now str3 will contain the trimmed string

        System.out.println("Trimmed string: '" + str3 + "'");





    }
}
