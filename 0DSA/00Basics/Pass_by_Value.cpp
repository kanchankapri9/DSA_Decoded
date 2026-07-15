#include <iostream>
using namespace std;

class Pass_by_Value {

public:
 void GreetKanchan(int Kanchan, int &kanchan) {
                        

                         cout << "-------------------------------------------------" << endl;
                         cout << "-------------------------------------------------" << endl;
                         cout << "This is the Start of the function executed printing the value " << endl;
                        
                         cout << "Hello " << kanchan << endl;
                         cout << "Hello " << Kanchan << endl;
                         kanchan += 3;
                         Kanchan += 3;

                         cout << "Hello " << kanchan << endl;
                         cout << "Hello " << Kanchan << endl;
                         cout << "This is the end of the function executed printing the value " << endl;
                         cout << "-------------------------------------------------" << endl;
                         cout << "-------------------------------------------------" << endl;
                         


                     }
                    
};



 int main() {

                     int kanchan = 10;
                     int Kanchan = 20;
                    cout << "-------------------------------------------------" << endl;
                    cout << "-------------------------------------------------" << endl;
                    
                    cout << "This is the Start of the main 's  executed printing the value " << endl;
                    
                    cout << "Hello " << kanchan << endl;
                    cout << "Hello " << Kanchan << endl;
                     
                     
                    Pass_by_Value p;
                    p.GreetKanchan(Kanchan, kanchan);

                    
                    //  GreetKanchan(kanchan);   // we need to create an object of the class to call the function GreetKanchan() because it is a member function of the class Pass_by_Value.
                    // whenn we do not need any object ?  is when we have a static function in the class , then we can call the function without creating an object of the class.
                    // static function is a function that belongs to the class rather than an object of the class.  it can be called without creating an object of the class.  it can only access static data members of the class.  it cannot
                    // ex :  
                    // static is a keyword in C++ that is used to declare static members of a class. 
                    // static members are members of a class that belong to the class itself rather than to an object of the class. 
                    // static members are declared in the class definition and can be accessed without creating an object of the class.


                    cout << "Hello " << kanchan << endl;
                    cout << "Hello " << Kanchan << endl;
                    cout << "-------------------------------------------------" << endl;
                   

                    cout << "This is the End of the main 's  executed printing the value " << endl;
                    cout << "-------------------------------------------------" << endl;


                     return 0;
                 }


                 