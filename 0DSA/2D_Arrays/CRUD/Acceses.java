// package 0DSA.2D_Arrays.CRUD;

public class Acceses {

    public static void main(String[] args) {
         int [] [] arr = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {2,3,4,5,}
    };

    System.out.println(arr[0][0]); // 1
    System.out.println(arr[1][2]); // 7
    System.out.println(arr[2][3]); // 12
        
    // Printing all the Elements of the 2d array
            System.out.println("------------------");


    for(int i =0; i<arr.length; i++){
        for(int j =0; j<arr[i].length; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();

       
        
    }


}
}