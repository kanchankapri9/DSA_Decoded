#include <iostream>
using namespace std;

class Parttern4
{
public:
    static void Parttern(int n)
    {

        // outer loop 
        for(int i=0; i<n; i++) {

             // space
            for(int j=0; j<n-i-1; j++) {
                cout << " ";
            }


             // star
            for(int j=0; j<2*i+1; j++) {
                cout << "*";
            }



             // space
                 for(int j=0; j<n-i-1; j++) {
                cout << " ";

        }

        cout << endl;
       
        }
    }
};

int main () {
    int n ;
    cin >> n;
   Parttern4 p;
    p.Parttern(n);
    return 0;
}