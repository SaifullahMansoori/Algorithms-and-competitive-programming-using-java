/**
 * This program demonstrates finding the insert position of a target element in a sorted array using binary search.
 * The user inputs the number of test cases and an array for each test case.
 * For each test case, the program finds the insert position of the target element in the array using binary search.
 * The program then prints the insert position for each test case.
 * 
 * Author: Saifullah Mansoori
 */
package binary_search;

import java.util.Scanner;

public class search_Insert_Position_1 {

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

        // Call the algorithm function to find the insert position and print the result
        insert_Position(arr, target);
    }

    // Function to find the insert position of the target element in the sorted array using binary search
    private static void insert_Position(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // If the target element is greater than the middle element, search in the right part of the array
            if (arr[mid] < target) {
                left = mid + 1;
            } 
            // If the target element is less than or equal to the middle element, search in the left part of the array
            else {
                right = mid - 1;
            }
        }
        // The insert position for the target element is the value of 'left'
        System.out.println(left);
    }
}
