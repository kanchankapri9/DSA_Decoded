#include <iostream>
#include <bits/stdc++.h>
using namespace std;


class SwitchCase {
    public :
    void SwitchC (int n ) {
        switch(n) {
            case 1 :
            cout << "Monday";
            break;
            case 2 :
            cout << "Tuesday";
            break;
            case 3 :
            cout << "Bye";
            break;
            default :  
            cout << "Invalid";
        }
    }

};

int main () {
    cout << "Emter";
    int n ;
    cin >> n;
    SwitchCase c;
    c.SwitchC(n);

}

