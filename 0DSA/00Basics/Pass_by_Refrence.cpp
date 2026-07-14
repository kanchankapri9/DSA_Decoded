                               // Pass by Value vs Pass by Refrence
//------------------------------------------------------------------------------------------------


// Pass by Value 

/*

Pass by value  is



*/



#include <iostream>
using namespace std;


                  
void hi() {
    int i = 1;
    cout << i << endl;
    i += 7;
    cout << i << endl;
    
    i += 4;
    cout << i << endl;



}


int main () {
    int i = 1;
    cout << i << endl;
    hi();
    cout << i << endl;
    cout << i << endl;

}

















//------------------------------------------------------------------------------------------------

// Pass by refrence

/*

Pass by refrence



*/






// run commmand :




g++ Pass_by_Refrence.cpp -o Pass_by_Refrence.exe

.\Pass_by_Refrence.exe
