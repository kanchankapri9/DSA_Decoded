#include <iostream>
#include <bits/stdc++.h>
using namespace std;

class LargestElementFinder {
public:
    int largestElement(vector<int>& nums) {
        
        int Largest = nums[0];  
        for(int i=1; i<nums.size(); i++) {
            if( nums[i] > Largest) {
                Largest = nums[i];
            }
        }
        return Largest;
    }
};


int main () {
    int n;
    cout << "Enter the number of elements: ";
    cin >> n;

    vector<int> nums(n);
    cout << "Enter the elements: ";
    for(int i=0; i<n; i++) {
        cin >> nums[i];
    }

    LargestElementFinder finder;    // creating object of class 
    // int sgest = finder1 = new LargestElementFinder(); // creating object of class
    int largest = finder.largestElement(nums);
    cout << "The largest element is: " << largest << endl;

    return 0;
}



