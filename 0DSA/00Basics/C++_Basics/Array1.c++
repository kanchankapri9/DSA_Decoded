#include <iostream>
#include <bits/stdc++.h>
using namespace std;

// arrys always go with the refrence variable and not with the value variable it chnages only the copy of the value variable and not the original value variable
// and all of the other ex : string , vector , map , set , list etc , where we havw to pass the  refrence variable

class Array1 {
    public :
    void printArray (int arr[], int n ) {
        for (int i = 0; i<n; i++) {
            cout << arr[i] << " ";
        }
    }

    
};


int main () {
    int n ;
    cin >> n;
    int arr[n];
    for (int i=0; i<n; i++) {
        cin >> arr[i];
    }
    Array1 i;
    i.printArray(arr, n);
}