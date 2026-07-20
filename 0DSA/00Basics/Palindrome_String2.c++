#include <iostream>
using namespace std;

class Palindrome_String2{
    public :
    bool isPalindrome(string str) {
        for(int i=0; i<str.length()/2; i++) {
            
            if(str[i] !=  str[str.length()-i-1]) {
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

    Palindrome_String2 ps; // 
    if (ps.isPalindrome(str)) {       // 
        cout << "The string is a Palindrome" << endl;
    } else {
        cout << "The string is not a Palindrome" << endl;
    }

}