// package 1Leetcode.Day1;

public class Practice {


    public static void main(String[] args) {
        String s = "abcabcbb";
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                System.out.println(
                        "i = " + i +
                                " j = " + j +
                                " substring = " +
                                s.substring(i, j)); //   (i = (0 index) , j+ 1 = because of this method will exclude last index that's why j+ 1)
            }
        }
    }
    
}




/*

Notice: when i = j, the substring is empty ("").

BBECAUSE the substring method in Java takes two parameters: the starting index (inclusive) 
and the ending index (exclusive). So when i = j, it means we are trying to get a substring that starts and ends at the same index,
 which results in an empty string.


*/