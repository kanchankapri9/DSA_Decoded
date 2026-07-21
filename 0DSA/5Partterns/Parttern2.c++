#include <iostream>
using namespace std;

class Parttern2
{

public: 
    static void Parttern_Two(int n) {

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                cout << "* ";
            }
            cout << endl;
        }
    }
};

int main() {
    
    int n;
    cin >> n;
    Parttern2::Parttern_Two(n);
}

