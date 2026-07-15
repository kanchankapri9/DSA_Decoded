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

Pass by refrence  :   only takes the copy , it does not change the original value of the varible. 
                     it does everything with the copy of the variable , it does not change the original value of the variable.
                     like , if we pass a variable by refrence to a funciton , it will not change the original value of the variable , it will only change the copy of the variable that is passed to the function.
                     and if we will print the varible in main function , it will print the original value of the variable , 
                     not the changed value of the variable that is passed to the function.
                      

                     ex :       
                     

                    void GreetKanchan(Kanchan &kanchan) {
                         cout << "Hello " << kanchan << endl;
                         kanchan += 3;
                         Kanchan += 3;

                         cout << "Hello " << kanchan << endl;
                         cout << "Hello " << Kanchan << endl;
                     }

                     int main() {

                     int kanchan = 10;
                     int Kachan = 20;
                    

                    cout << "Hello " << kanchan << endl;
                    cout << "Hello " << Kanchan << endl;
                     
                     

                    
                     GreetKanchan(kanchan);


                    cout << "Hello " << kanchan << endl;
                    cout << "Hello " << Kanchan << endl;
                     return 0;
                     }




*/




//-----------------------------------------------------------------------------------




// run commmand :


// g++ Pass_by_Refrence.cpp -o Pass_by_Refrence.exe

// .\Pass_by_Refrence.exe


//-----------------------------------------------------------------------------------
