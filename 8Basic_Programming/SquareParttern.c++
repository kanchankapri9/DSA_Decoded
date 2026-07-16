// c++ suntax difference from java

#include <iostream>
using namespace std;



class ladder_pattern{
    public:
        void printLadder(int n){
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= i; j++){
                    cout << "* ";
                }
                cout << endl;
            }
        }
};

int main() {
    int t;
    cin >> t;
    while (t--) {     // the test caseswill be executed t times , we also can write this as for(int i=0; i<t; i++) or while(t>0) { t--; } 
        int n;
        cin >> n;
        ladder_pattern lp;
        lp.printLadder(n);
    }
}

