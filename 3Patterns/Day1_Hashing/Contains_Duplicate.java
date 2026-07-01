// package 3Patterns.Day1_Hashing;

// if the array contains duplicate then return the true else false


//Leetcoode 217. Contains Duplicate

import java.util.HashSet;

public class Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); 
        for (int num : nums) { // this for loop meanse -> num is the variable that will take each element of the array nums .
            if (!set.add(num)) { // if the set already contains the num then it will return true else it will add the num to the set and return false.
                return true;
            }
        }
         return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,4,5};
        Contains_Duplicate cd = new Contains_Duplicate(); // this is the object of the class Contains_Duplicate we create the object to call the method containsDuplicate 
        System.out.println(cd.containsDuplicate(nums)); // cd . meanse the object of the class dot meanse to call the method containsDuplicate.

    }

}