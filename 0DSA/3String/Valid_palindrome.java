// // Valid Palindrome 125  leetcode

// // Problem and conditions-

// //1. Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
// // if !alphanumeric is not present then it can be ignored.
// // code line - is_AlphaNumeric(s.charAt(i))

// //2. A string is a palindrome when it reads the same forward and backward.  
// if (s == null) return true;  // if string is null then return true
// if (string is same from i and j wich are front and back then it is palindrome) return true; else return false;



// //3. Alphanumeric characters include letters and numbers.

// it only can include letters and numbers. if any other character is present then it can be ignored.
// code line = is_AlphaNumeric(s.charAt(i)) 



// // The algorithm-

// the aldgo -

// 1. if string is null then return true;
// 2. if string is same from i and j wich are front and back then it is palindrome) return true; else return false;
// 3. Alphanumeric characters include letters and numbers.
// 4. if any other character is present then it can be ignored.




class ValidPalindrome {

    public boolean isPalindrome(String s) {
        if(s == null) return true;  // if sring is null we can not check for palindrome so return true
        int i = 0; // i is front pointer
        int j = s.length() - 1; // j is back pointer
        while(i < j) {  // while i is less than j measne it actully the middle of the string is not reached yet
            while(i < j && !is_AlphaNumeric(s.charAt(i))) i++; // if the character is not alphanumeric then move the front pointer to next character
            while(i < j && !is_AlphaNumeric(s.charAt(j))) j--; // if the character is not alphanumeric then move the back pointer to previous character
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false; // if the character is not same then return false
            i++; // move the front pointer to next character
            j--; // move the back pointer to previous character
        }
        return true;
    }


    private boolean is_AlphaNumeric(char c) { // check if the character is alphanumeric or not
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'); // if the character is alphanumeric then return true else return false
    }
}

// main 


