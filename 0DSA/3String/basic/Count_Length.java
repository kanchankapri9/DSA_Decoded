package basic;

public class Count_Length {
    public static void main(String[] args) {
        String str = "Hello World";
        int length = str.length();
        System.out.println("Length of the string: " + length); // Output: Length of the string: 11


        // without using length() method
        int count = 0;
        for (char c : str.toCharArray()) {  // to char array meanse we are converting string into char array and then we are iterating through each character of the string
            count++;
        }
        System.out.println("Length of the string (without using length()): " + count); // Output: Length of the string (without using length()): 11



        // because string can not be accessed by index like array,
        //  so we can not use for loop to count the length of the string,
        //  we have to use for each loop to iterate through each character of the string and count the number of characters in the string.

        // that's why we have to use the char array which is created by toCharArray() method to count the length of the string without using length() method.

        // char array mean by default it will be created when we use toCharArray() method,
        //  it will create a char array of the same length as the string and copy each character of the string into the char array.


    }
}

