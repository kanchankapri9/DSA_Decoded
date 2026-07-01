package basic;
import java.util.Scanner;

public class Count_vowels {
    static int Count_vowels(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        int vowelCount = Count_vowels(str);
        System.out.println("Number of vowels in the string: " + vowelCount);
    }
}

