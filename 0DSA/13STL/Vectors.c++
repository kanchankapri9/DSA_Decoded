// Vectors All operations 

// Vectors are dynamic arrays that can grow and shrink in size. They are part of the C++ Standard Template Library (STL) and provide a convenient way to store and manipulate collections of elements. Here are some common operations that can be performed on vectors:
// we can increse the size of vector dynamically and we can also decrease the size of vector dynamically.
// 1. Creating a Vector:

#include <iostream>
#include <vector>
using namespace std;

int main() {
    // Create a vector of integers
    vector<int> numbers;

    // Add elements to the vector
    numbers.push_back(10);
    numbers.push_back(20);
    numbers.push_back(30);

    // Access elements of the vector
    cout << "First element: " << numbers[0] << endl;
    cout << "Last element: " << numbers[numbers.size() - 1] << endl;

    // Modify elements of the vector
    numbers[1] = 25;

    // Remove elements from the vector
    numbers.pop_back();

    // implce back() function is used to add an element at the end of the vector.
    numbers.emplace_back(40);   // the diffrence between push_back() and emplace_back() is that push_back() creates a copy of the object and adds it to the vector, while emplace_back() constructs the object in place, avoiding the need for a copy.
    //  Implace back is more faster than push_back() because it avoids the overhead of creating a temporary object and copying it into the vector.



    // Pair type of vector
    vector<pair<int, int>> vec;
    vec.push_back({1, 2});
    vec.push_back({3, 4});

    // Push back and implace back in the vectors 
    vec.emplace_back(5,6);
    vec.push_back({7,8}); // syntax diffrenciation .

    // Display the elements of the vector
    for (const auto& p : vec) {
        cout << "(" << p.first << ", " << p.second << ")" << endl;
    }
    return 0;
}