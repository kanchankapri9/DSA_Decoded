// package CRUD;

import java.util.Scanner;

public class Input_array {
    public static void main(String[] args) {
        // Code for inputting array elements
        int[] arr = new int[5]; // Create an array of size 5 /// new keyword is used to create new array in memory
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 elements " );
        for(int i=0; i<arr.length; i++) {
        System.out.println("Enter the element " + i );
            arr[i] = sc.nextInt();
        }


        System.out.println("The elements in the array are: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
