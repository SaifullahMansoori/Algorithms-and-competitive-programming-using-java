/**
 * This program demonstrates finding the insert position of a target element in a sorted array using binary search and recursion.
 * The user inputs the number of test cases and an array for each test case.
 * For each test case, the program finds the insert position of the target element in the array using binary search and recursion.
 * The program then prints the insert position for each test case.
 * 
 * Author: Saifullah Mansoori
 */
package binary_search;

import java.util.Scanner;

public class search_Insert_Position_Recursion_1 {

    static Scanner input = new Scanner(System.in);

    public static void main(String arg[]) {
        // Getting the number of test cases from the user
        int test = input.nextInt();
        while (test-- > 0) {
            Helper(); // Call the helper function for each test case
        }
    }

    // Helper function to get input from the user and call the algorithm function
    private static void Helper() {
        int n = input.nextInt(); // Number of elements in the array
        int arr[] = new int[n]; // Create an array to store the elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt(); // Input array elements
        }
        int target = input.nextInt(); // The number to find the insert position of

        // Call the recursive algorithm function to find the insert position and print the result
        int result = insert_Position_Recursion(arr, 0, arr.length - 1, target);
        System.out.println(result);
    }

    // Recursive function to find the insert position of the target element in the sorted array using binary search
    private static int insert_Position_Recursion(int arr[], int left, int right, int key) {
        // Base case: If left is greater than right or if left is out of array bounds, return the current left index as the insert position
        if (left > right || left > arr.length || right < 0) {
            return left;
        }
        
        int mid = left + (right - left) / 2; // Calculate the middle index
        
        if (arr[mid] < key) {
            // If the target element is greater than the middle element, search in the right part of the array
            return insert_Position_Recursion(arr, mid + 1, right, key);
        } else {
            // If the target element is less than or equal to the middle element, search in the left part of the array
            return insert_Position_Recursion(arr, left, mid - 1, key);
        }
    }
}
