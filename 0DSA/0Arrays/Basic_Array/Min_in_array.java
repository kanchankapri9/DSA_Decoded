public class Min_in_array {
    static int Mmin(int[] arr) {
        int min = arr[0];
        for (int i=1; i<arr.length; i++) {
            if(arr[i] < min ) {
                min = arr[i];
            }
        }
        return min;
    }



    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 4, 5};
        System.out.println(Mmin(arr));
    }
}