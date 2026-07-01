// package CRUD;

public class Deletion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        int arrSize = arr.length;

        System.out.println(" till arraysize ( n-1 ) ");


        for(int i = 0; i < arrSize - 1; i++) {
            System.out.print(arr[i] + " ,");
        }

        System.out.println();
        System.out.println(" till arraysize ( n) ");

        for(int i = 0; i < arrSize; i++) {
            System.out.print(arr[i] + " ,");
        }


        int deleteIndex = 3;

        for( int i = deleteIndex; i < arrSize - 1; i++) {
            arr[i] = arr[i+1];
        }
        arrSize--;

        System.out.println();

        System.out.println(" till arraysize ( n ) ");
        for(int i = 0; i < arrSize; i++) {
            System.out.print(arr[i] + " .");
        }
    }
    
}
