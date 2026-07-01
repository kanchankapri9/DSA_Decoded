// package 1Leetcode.Day1;

public class Rough {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                System.out.println(
                        "i = " + i +
                                " j = " + j +
                                " substring = " +
                                s.substring(i, j + 1)); //   (i = (0 index) , j+ 1 = because of this method will exclude last index that's why j+ 1)
            }
        }
    }
}

// My Thought in it

/*
 * 
 * 
 * 
 * 
 * 
 * (0,0) -> "a"
 * (0,1) -> "ab"
 * (0,2) -> "abc"
 * (0,3) -> "abcd"
 * (0,4) -> "abcde"
 * 
 * (1,1) -> "b"
 * (1,2) -> "bc"
 * (1,3) -> "bcd"
 * (1,4) -> "bcde"
 * 
 * (2,2) -> "c"
 * (2,3) -> "cd"
 * (2,4) -> "cde"
 * 
 * (3,3) -> "d"
 * (3,4) -> "de"
 * 
 * (4,4) -> "e"
 * 
 * 
 * 
 * 
 * 
 * 
 */





                         // Learings

/*

int i = 100;                // outer i
for (int i = 0; i < 5; i++) {
    System.out.println("Loop i = " + i);
}
System.out.println("Outer i = " + i);



*/