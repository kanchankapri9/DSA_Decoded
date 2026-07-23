#include <iostream>
using namespace std;


// Parttern 3

// 1, 22, 333, 4444 ,5555


class Parttern4 {
    public :
    static void Print_P4 ( int n ) {
        for ( int i = 0; i<n; i++) {
            for (int j = 0; j<n; j++) {
                cout << j + 1 << " " ;
            }

            cout << endl ;
        }

    }

};


int main() {
    int n ;
    cin >> n;
    Parttern4::Print_P4( n);
    
   
}















/*



#include <iostream>
using namespace std;


// Parttern 3

// 1, 22, 333, 4444 ,5555


class Parttern4 {
    public :
    static void Print_P4 ( int n ) {
        for ( int i = 0; i<=n; i++) {
            for (int j = 0; j<=n; j++) {
                cout << "* " ;
            }

            cout << endl ;
        }
    }

};


int main() {
    int n ;
    cin >> n;
    Parttern4::Print_P4( n);
   
}






*/