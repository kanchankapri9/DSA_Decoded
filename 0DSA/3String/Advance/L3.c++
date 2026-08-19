#include <iostream>
using namespace std;

// function for finding longest substring without reapeting characters

static int LongestSubString(int*g, int length) {
    // Implementation for finding longest substring without repeating characters
    int count = 0;
    for(int i =0; i < length; i++) {
        // Logic to find longest substring
        if(g[i] == g[i+1]) {
            // Handle repeating character case
            i++; 
        } else {
            count++;
            i++;
        }
    }
    return count-1;
}


int main() {
    int arr[] = {1, 2, 3, 4, 5, 1, 2, 3};
    int length = sizeof(arr) / sizeof(arr[0]);
    int result = LongestSubString(arr, length);
    cout << "Length of longest substring without repeating characters: " << result << endl;
    return 0;
}

// heello