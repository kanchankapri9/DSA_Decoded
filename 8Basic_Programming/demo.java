// sum of digits

public class demo {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            num = num / 10;
        }
        System.out.println(sum);
    }
}


// explain line by line

// // Sure! Let's go through the code line by line:

// ```java
// // sum of digits

// public class demo {
//     public static void main(String[] args) {

//         int num = 1234;
//         int sum = 0;
//         while (num > 0) {
//             int rem = num % 10;
//             sum += rem;
//             num = num / 10;
//         }
//         System.out.println(sum);
//     }
// }


// 6. `while (num > 0) {`: This line starts a loop that runs as long as the value of `num` is greater than `0`.
// 7. `int rem = num % 10;`: This line calculates the remainder when `num` is divided by `10`. The remainder is assigned to the variable `rem`.
// 8. `sum += rem;`: This line adds the value of `rem` to the variable `sum`.
// 9. `num = num / 10;`: This line divides the value of `num` by `10`. The result is assigned back to `num`.   This effectively removes the last digit from `num`.
// 10. `System.out.println(sum);`: This line prints the value of `sum` to the console.
// 11. `}`: This line ends the loop.
// 12. `}`: This line ends the `main()` method.


