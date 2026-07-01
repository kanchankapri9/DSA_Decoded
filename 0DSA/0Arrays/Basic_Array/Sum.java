// package Basic_Array;

public class Sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int sum = 0;


        System.out.println(" till arraysize ( n-1 ) ");
        
        for(int i = 0; i<arr.length; i++) {   // i<=arr.length-1;  is another way to write this loop
            sum += arr[i];
        }
        System.out.println(sum);
        
        // sum became = 15 now 


        System.out.println(" till arraysize ( n ) ");
        System.out.println(" ----------------------------");

         for(int i = 0; i<arr.length-1; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        
        int sum2 = 0;

        for(int i = 0; i<arr.length; i++) {   // i<=arr.length-1;  is another way to write this loop
            sum2 += arr[i];
        }
        System.out.println(sum2);

        }

    
}
