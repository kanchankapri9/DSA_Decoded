#include <iostream>
using namespace std;


class Day4
{
public:
    void pattern1(int n)
    {
        for (int row = 0; row < n; row++)
        {
            for (int col = 0; col < n; col++)
            {
            }
            cout << "* ";
        }
        cout << " " << endl;
    }
};


int main()
{
    Day4 obj;
    int n;
    cout << "Enter the number of rows: ";
    cin >> n;
    obj.pattern1(n);
    return 0;
}









/