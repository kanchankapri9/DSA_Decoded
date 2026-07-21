
#include <iostream>
using namespace std;

class Parttern2
{

public: 
    static void Parttern_Two(int n) {

        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {              
                cout << i + 1 << " ";    // 1, 22, 333
            }
            cout << endl;
        }
    }
};

int main() {
    
    int n;
    cout << "Enter the number of rows: ";
    cin >> n;
    Parttern2::Parttern_Two(n);
}

