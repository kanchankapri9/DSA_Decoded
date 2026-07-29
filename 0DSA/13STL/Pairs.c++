// Pais in C++

// Pairs are a simple data structure in c++ that allows you to store two related values together.
// They are part of the Standard Template Library (STL) and are defined in the <utility> header file.
// A pair is a template class that takes two types as template parameters and allows you to store two values of those types together.
// The first type is called the first type and the second type is called the second type.

// The syntax for creating a pair is as follows:
// std::pair<first_type, second_type> pair_name;

#include <iostream>
#include <utility> // for std::pair
using namespace std;

int main() {
    // Creating a pair of int and char
    pair<int, char> pair1;
    pair1.first = 10; // Assigning value to the first element of the pair
    pair1.second = 'a'; // Assigning value to the second element of the pair
    pair1.second = 'b'; // Updating the second element of the pair

    // Nested Pair
    pair < pair<int, int>, int >  p ={{1, 2}, 3};

  // Pair Array 
    pair <int, int> arr[5] = { {1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10} };

    cout << pair1.first << " " << pair1.second << endl;  // 
    cout << p.first.first << " " << p.first.second << " " << p.second << endl;
    for (int i = 0; i < 5; i++) {
        cout << arr[i].first << " " << arr[i].second << endl;  // output : 1 2 3 4 5
        cout << arr[1].first << " " << arr[1].second << endl;  // output : 3 4
    }
    return 0;
}

