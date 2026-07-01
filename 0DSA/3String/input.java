import java.util.Scanner;

public class input {

    public static void main(String[] args) {
        // String name = "Hello World";
        // System.out.println(name);

        System.out.println("Input Your Name");
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine(); // line input for string

        System.out.println("Your Name is " + Name);


        System.out.println("Input Your Name 2");
        // Scanner sc1 = new Scanner(System.in);
        String Name2 = sc.nextLine(); // line input for string

        System.out.println("Your Name is " + Name2);


    }
}



// scanner sc = new Scanner(System.in);
// this is the syntax for creating a scanner object to read input from the user. The Scanner class is part of the java.util package and is used to read input from various sources, including the keyboard (System.in). In this case, we are creating a Scanner object named "sc" that will read input from the standard input stream (the keyboard).
// we just write it before the main method and then we can use it to read input from the user. For example, we can use sc.nextLine() to read a line of text input from the user and store it in a String variable.
// we write it just one time and then we can use it multiple times to read different inputs from the user.