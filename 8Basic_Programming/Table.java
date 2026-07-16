// package 8Basic_Programming;

public class Table {
    // function call 
    // x = 10 
    // x++   = argument = 10 , x++   10 print then incerment  (postincrement)
    // ++x   = argument = 10 , ++x  increment first then print 11    ( preincrement)  increment first then print 11
    // x--   = argument = 10 , x--  10 print then decerment  (postdecrement)
    // --x   = argument = 10 , --x  decrement first then print 9    ( predecrement)  decrement first then print 9
    public static void main(String[] args) {
        // int x = 10;
        // System.out.println(x++); // 10   first print then increment , it will print 10 but in the argument it will be 11 , what are arguments ? arguments are the values that are passed to the function
        // System.out.println(x--); // 12   first 
        // System.out.println(--x); // 10


        for(int i =1; i<=10; i++) {    // for i = 1 , it will 1 to 9      
            for(int j = 1; j<=10; j++) {    // for j = 1 , it will 1 to 9
                System.out.print(i*j + "\n ");                  // i * j = 1*1 = 1 , 1*2 = 2 , 1*3 = 3 , 1*4 = 4 , 1*5 = 5 , 1*6 = 6 , 1*7 = 7 , 1*8 = 8 , 1*9 = 9
            }
            System.out.println();
        }




    }
}