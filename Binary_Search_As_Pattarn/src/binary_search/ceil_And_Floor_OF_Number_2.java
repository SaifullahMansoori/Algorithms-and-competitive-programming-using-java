/**
 * This program demonstrates finding the ceiling and floor of a target number in a sorted array using binary search.
 * The user inputs the number of test cases and an array for each test case.
 * For each test case, the program finds the ceiling and floor of the target number in the array using binary search.
 * If the target number is not present in the array, it finds the next greater (ceiling) or next smaller (floor) number.
 * The program then prints the result for each test case.
 * 
 * Author: Saifullah Mansoori
 */
package binary_search;

import java.util.Scanner;

public class ceil_And_Floor_OF_Number_2 {

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
        int[] arr = new int[n]; // Create an array to store the elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt(); // Input array elements
        }
        int target = input.nextInt(); // The number to find the ceiling and floor for

        // Call the algorithm functions and print the results
        ceiling(arr, target);
        floor(arr, target);
    }

    // Function to find the ceiling of the target number in the sorted array
    private static void ceiling(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int index = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate the middle index
            // Find the target in the array
            if (arr[mid] == target) {
                index = mid;
                break;
            } else if (arr[mid] < target) {
                // Search in the right part of the array
                left = mid + 1;
            } else {
                // Search in the left part of the array
                right = mid - 1;
            }
        }
        // Check if the target was in the array or not
        if (index == -1) {
            // Print the ceiling of the number (next greater number)
            System.out.println(arr[left]);
        } else {
            // Print the index of the target which was found in the array
            System.out.println(index);
        }
    }

    // Function to find the floor of the target number in the sorted array
    private static void floor(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int index = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate the middle index
            // Find the target in the array
            if (arr[mid] == target) {
                index = mid;
                break;
            } else if (arr[mid] < target) {
                // Search in the right part of the array
                left = mid + 1;
            } else {
                // Search in the left part of the array
                right = mid - 1;
            }
        }
        // Check if the target was in the array or not
        if (index == -1) {
            // Print the floor of the number (next smaller number)
            System.out.println(arr[right]);
        } else {
            // Print the index of the target which was found in the array
            System.out.println(index);
        }
    }
}
