/**
 * This program demonstrates finding the first index and last index of a target element in a sorted array using binary search.
 * The user inputs the number of test cases and an array for each test case.
 * For each test case, the program finds the first index and last index of the target element in the array using binary search.
 * The program then prints the first index and last index for each test case.
 * 
 * Author: Saifullah Mansoori
 */
package binary_search;

import java.util.Scanner;

public class first_Index_And_Last_Index_2 {

    static Scanner input = new Scanner(System.in);

    public static void main(String arg[]) {
        // Getting the number of test cases from the user
        int test = input.nextInt();
        while (test-- > 0) {
            Helper(); // Call the helper function for each test case
        }
    }

    // Helper function to get input from the user and call the algorithm functions
    private static void Helper() {
        int n = input.nextInt(); // Number of elements in the array
        int[] arr = new int[n]; // Create an array to store the elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt(); // Input array elements
        }
        int target = input.nextInt(); // The number to find the first index and last index of

        // Call the algorithm functions and print the results
        firstIndex(arr, target);
        lastIndex(arr, target);
    }

    // Function to get the first index of the target element in the sorted array
    private static void firstIndex(int[] arr, int target) {
        int firstIndex = -1;
        int left = 0;
        int right = arr.length - 1;
        // Finding the first Index 
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                firstIndex = mid;
                // Search again to find the first occurrence
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.print(firstIndex + " ");
    }

    // Function to get the last index of the target element in the sorted array
    private static void lastIndex(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int lastIndex = -1;
        // Finding the last Index 
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                lastIndex = mid;
                // Search again to find the last occurrence
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(lastIndex);
    }
}
