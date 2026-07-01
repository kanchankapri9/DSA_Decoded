//Crud Operation in Array 

// Creation :

import java.util.Arrays;

class ArrayCrud {

    public static void main(String[] args) {

        // Creation
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = new int[6];
        int[] arr3 = {1, 4, 5, 6, 8};

        // Update
        arr1[4] = 6;
        arr2[3] = 5;
        arr3[4] = 4;

        // Read
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.println("Array 3: " + Arrays.toString(arr3));
    }
}





/*


class ArrayCrud {

    static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = new int[6];
        int[] arr3 = {1, 4, 5, 6, 8};

        arr1[4] = 6;
        arr2[3] = 5;
        arr3[4] = 4;

        printArray(arr1);
        printArray(arr2);
        printArray(arr3);
    }
}





*/