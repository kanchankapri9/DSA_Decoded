// package 1Leetcode.Day1;


//Question :

// Given a string s , find the length of the longest substring without repeating characters.
class LongestSubstringCount {
public int longestSubstringCount(String s) {
    int n = s.length();
    int maxLength = 0; // The max length is initialized to 0

    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            String subString = s.substring(i, j + 1); // Generate the substring from index i to j .substring is a method in java which excludes the end index so we add 1 to include j in the substring
            if (isUnique(subString)) { // Check if the substring has all unique characters  isUnique is a helper function 
                maxLength = Math.max(maxLength, subString.length()); // Update max length if current substring is longer
            }
        }
    }

    return maxLength; // Return the maximum length found
}

// Helper function to check if all characters in the substring are unique
public boolean isUnique(String subString) {
    java.util.HashSet<Character> set = new java.util.HashSet<>(); // a set can not contain duplicate elements so we can use it to check for duplicates
    for (char c : subString.toCharArray()) { // Iterate through each character in the substring
        if (set.contains(c)) {  //Have I already seen this character?
            return false;  // If the character is already in the set, it's duplicate, so return false  
     }
        set.add(c);  // If the character is not in the set, add it to the set
    }
    return true; // If we finish checking all characters and find no duplicates, return true
}



public static void main(String[] args) {

        LongestSubstringCount obj = new LongestSubstringCount();

        int answer = obj.longestSubstringCount("abcabcbb");

        System.out.println(answer);
    }
}

//                      Approachs

/*



***        Brute Force Approach



Generate every substring and check if it contains duplicate characters.

Time Complexity: O(n³)
Not efficient for n = 5 * 10⁴


                     
***        Optimal Approach: Sliding Window Idea


Maintain a window [left, right] that always contains unique characters.

Expand right
If duplicate found, move left until duplicate is removed
Keep track of max length

Time Complexity: O(n)

*/























             // // // My thoughts in it // // // // 




// We have to iterate all indexes with j adding all next elements to a set until we find a duplicate. 
// We will keep track of the maximum length of the substring without repeating characters.

// Now question is how to check if the character is already present in the set or not?

// We can use a HashSet to store the characters in the current window.


/*

for(int i = 0; i<s.length(); i++){
HashSet<Character> set = new HashSet<>();
int maxLength = 0;

for( int j = i; j<s.length(); j++) {
if(set.contains(s.charAt(j))) {
    break;
}
else {
    set.add(s.charAt(j));
    maxLength = Math.max(maxLength, j-i+1);
}
}



*/