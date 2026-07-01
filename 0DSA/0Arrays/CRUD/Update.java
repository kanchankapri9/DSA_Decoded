package CRUD;

public class Update {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 0};

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        arr[4] = 5; // simple do this it will update and the value of 0 will be replaced by 5 and 0 will be lost

        System.out.println();

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }    
}