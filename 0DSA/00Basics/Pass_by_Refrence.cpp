                                            // Pass by Value vs Pass by Refrence
//------------------------------------------------------------------------------------------------


                                                         // Pass by Refrence


/*

Pass by Refrence  :   it takes the address of the variable , it does not take the copy of the variable  is, it takes the address of the variable that is passed to the function.
                     and if we will print the varible in main function , it will print the address of the variable that is passed to the function.
                     and if we will print the varible in the function , it will print the address of the variable that is passed to the function. 
                     
                     and since it taked the address of the variable in parameters, so it will manuplate the orignal,
                     and when we will print the varible in main function , it will print the changed value of the variable that is passed to the function.
                     and if  we print the varible with the & operator in the function , it will print the address of the variable that is passed to the function.
                     and if we print the varible with the & operator in the main function , it will



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

                                                                  // Pass by Value



/*

Pass by Value  :   only takes the copy , it does not change the original value of the varible. 
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




// run commmand :  for executing c++.


// g++ Pass_by_Refrence.cpp -o Pass_by_Refrence.exe

// .\Pass_by_Refrence.exe


//-----------------------------------------------------------------------------------
