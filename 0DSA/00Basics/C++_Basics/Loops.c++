// for loop 

#include <iostream>
using namespace std;

int main () {
    int n ;
    cin >> n;
    for (int i=0; i<n; i++) {
        cout << i << " ";
    }


    // while loop

    int j = 0;
    while (j<n) {
        cout << j << " ";
        j++;
    }


    // do while loop

    int k = 0;
    do {
        cout << k << " ";
        k++;
    } while (k<n);
            
}