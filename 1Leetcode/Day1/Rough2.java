// package 1Leetcode.Day1;

public class Rough2 {
    public static void main(String[] args) {

    int i = 100; // outer i
    for (int i2 = 0; i2 < 5; i2++) {
    System.out.println("Loop i2 = " + i2);
}
System.out.println("Outer i = " + i);

}
}






/*


You declared int i = 100; outside the loop.

Then inside the for loop header, you wrote for (int i = 0; …).

That means you’re trying to declare another variable named i in the same scope (the method body).

Java doesn’t allow two variables with the same name in overlapping scopes. The compiler sees this as a duplicate declaration./*




*/





/*




Method scope: variables live only inside the method.

Loop scope: variables declared in the loop header or body live only inside that loop.

Same name ≠ same variable: redeclaring with the same name in overlapping scopes causes errors.

Declare outside if needed later: if you want to use a variable after the loop, declare it before the loop.


*/