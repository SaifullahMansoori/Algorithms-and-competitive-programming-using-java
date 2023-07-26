/**
 * This program demonstrates finding the smallest letter greater than the target in a sorted character array using binary search.
 * The user inputs the number of test cases and an array of characters for each test case.
 * For each test case, the program finds the smallest letter greater than the target character in the array using binary search.
 * The program then prints the result for each test case.
 * 
 * Author: Saifullah Mansoori
 */
package binary_search;
import java.util.Scanner;

// Main class for finding the smallest letter greater than the target using recursion
public class find_Smallest_Letter_Greater_Than_Target_Recursion_3 {

    // Create a Scanner object to read user input
    static Scanner input = new Scanner(System.in);

    // Main method to start the program
    public static void main(String arg[]) {
        // Read the number of test cases from the user
        int test = input.nextInt();

        // Process each test case
        while (test-- > 0) {
            // Call the helper method for each test case
            helper();
        }
    }

    // Helper method to handle each test case
    private static void helper() {
        // Read the number of elements in the array from the user
        int n = input.nextInt();

        // Create an array to store the letters
        char[] letters = new char[n];

        // Read the letters from the user and store them in the array
        for (int i = 0; i < letters.length; i++) {
            letters[i] = input.next().charAt(0);
        }

        // Read the target letter from the user
        char target = input.next().charAt(0);

        // Call the recursive method to find the smallest letter greater than the target
        char result = letter_Greater_Than_Target_Recursion(letters, target, 0, letters.length - 1);

        // Print the result - the smallest letter greater than the target
        System.out.println(result);
    }

    // Recursive method to find the smallest letter greater than the target
    private static char letter_Greater_Than_Target_Recursion(char[] letters, char target, int left, int right) {
        // Base case: If the left index becomes greater than the right index,
        // we have searched the entire array without finding the desired letter.
        // In this case, we need to handle the wraparound behavior and return the first letter.
        if (left > right) {
            return letters[left % letters.length]; // Handle wraparound
        }

        // Calculate the middle index of the current search range
        int mid = left + (right - left) / 2;

        // If the middle letter is less than or equal to the target,
        // it means the desired letter lies in the right half of the array.
        // So, we recursively search the right half of the array.
        if (letters[mid] <= target) {
            return letter_Greater_Than_Target_Recursion(letters, target, mid + 1, right);
        } else {
            // If the middle letter is greater than the target,
            // it means the desired letter lies in the left half of the array.
            // So, we recursively search the left half of the array.
            return letter_Greater_Than_Target_Recursion(letters, target, left, mid - 1);
        }
    }
}
