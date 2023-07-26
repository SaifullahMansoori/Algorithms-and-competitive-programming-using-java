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

public class find_Smallest__Letter_Greater_Than_Target_3 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Getting the number of test cases from the user
        int test = input.nextInt();
        while (test-- > 0) {
            Helper(); // Call the helper function for each test case
        }
    }

    // Helper function to get input from the user and call the algorithm function
    private static void Helper() {
        int n = input.nextInt(); // Number of elements in the character array
        char[] letters = new char[n]; // Create a character array to store the elements
        for (int i = 0; i < letters.length; i++) {
            letters[i] = input.next().charAt(0); // Input array elements as characters
        }
        char target = input.next().charAt(0); // The character to find the smallest letter greater than

        // Call the algorithm function and print the result
        Letter_Greater_Than_Target(letters, target);
    }

    // Function to find the smallest letter greater than the target in the sorted character array
    private static void Letter_Greater_Than_Target(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate the middle index
            if (letters[mid] < target) {
                left = mid + 1; // Search in the right part of the array
            } else {
                right = mid - 1; // Search in the left part of the array
            }
        }
        System.out.println(letters[left % letters.length]); // Print the smallest letter greater than the target
    }
}
