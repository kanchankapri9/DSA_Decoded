// Palindrome string by using two pointer approach

#include <iostream>
using namespace std;

class Palindrome_String {

    public: 
     bool isPalindrome(string str) {  // we Hae changed this from static function
        int l = 0;
        int h = str.length()-1;

        while (h > l) {
            if(str[l++] != str[h--]) {
                return false;
            }
        }
        return true;
    }
};




int main () {
    string str;
    cout << "Enter a string: ";
    cin >> str;

    Palindrome_String ps; // creating object of class Palindrome_String
    if (ps.isPalindrome(str)) {       // (Palindrome_String::isPalindrome(str)    - Meaning - ?
        cout << "The string is a Palindrome" << endl;
    } else {
        cout << "The string is not a Palindrome" << endl;
    }

}




/*

g++  Palindrome_String.c++ -o Palindrome_String
PS D:\Pattern-wise-DSA\0DSA\00Basics> ./Palindrome_String



*/





/*

(Palindrome_String::isPalindrome(str)  


meaning of this syntax is that we are calling the static function isPalindrome() of the class Palindrome_String without creating an object of the class.
(Palindrome_String::isPalindrome(str)    Palindrome_String :: -  This is the scope resolution operator. I
t is used to define the function outside the class and also to access the static members of the class.





*/







/*


Static Function : 
      this is the static function of the class Palindrome_String.
       We can call this function without creating an object of the class. We can call this function by using the class name and the scope resolution operator (::) as shown below:
      Palindrome_String::isPalindrome(str)  - Meaning - ?
      the resolution operator (::) is used to access the static members of the class. It is also used to define the function outside the class.



Non static Function :
this is the non static function of the class Palindrome_String. We need to create an object of the class to call this function. We can call this function by using the object of the class as shown below:
      ps.isPalindrome(str)  - Meaning - ?
      the dot operator (.) is used to access the non static members of the class. It is also used to define the function inside the class.



*/