#include <iostream>
#include <bits/stdc++.h>
using namespace std;

class Parttern3 {
    public :
    void printPattern (int n ) {
        for (int i=1; i<n; i++) {
            for (int j=0; j<=n+1; j++) {
                cout << j <<"* ";
            }
            cout << endl;
        }
    }

    
};


int main () {
    int n ;
    cin >> n;
    Parttern3 p;
    p.printPattern(n);
}