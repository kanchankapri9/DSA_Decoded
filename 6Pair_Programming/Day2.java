// 2 sum , sorted one


// the question is saying array is sorted in non decresing order , and we have to find two numbers which sum is equal to target value
// and said that , we do not use same element twice , so we can use two pointer approach to solve this problem in o(n)
// Now, the meaning of not using the same element twice is that we can not use the same index twice, but we can use the same value if it is present at different indices, for example [2,2,3] and target = 4 , we can use both 2's as they are present at different indices
// we can use two pointer approach to solve this problem in o(n) time complexity and o(1) space complexity



// 1. we can use two pointer approach to solve this problem in o(n) time complexity and o(1) space complexity
// 2. we can use binary search to solve this problem in o(n) time complexity and o(1) space complexity
// 3. we can use hash map to solve this problem in o(n) time complexity and o(n) space complexity
// 4. we can use brute force approach to solve this problem in o(n^2) time complexity and o(1) space complexity



// Binary Search approach =


// import java.util.*;

public class Day2 {

    public static void main(String[] args) {

        int[] arr = {2,6,7,8,9,10};
        int target = 8;
        boolean found = false;

        // Arrays.sort(arr); // sorting the array in non decreasing order  // in our case it is sorted the given one

        int left = 0;
        int right = arr.length-1;

        while(left<right) {
            int sum = arr[left] + arr[right];

            if(sum == target) {
                System.out.println("Pair Found ji  at the indexes : " + left + "and" + right);
                found = true;
                break;   // we are breaking here because we are only looking for one pair , if we want to find all the pairs then we can remove this break statement
            } else if(sum < target) {
                left++;
            } else {
                right--;
            }
        }

        if(!found) {
            System.out.println("No pair found ji , with the given sum.");
        }


    }
}
