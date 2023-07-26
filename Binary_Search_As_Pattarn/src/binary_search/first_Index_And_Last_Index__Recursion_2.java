/**
 * This program demonstrates finding the first and last index of a target element in a sorted array using recursion.
 * The user inputs the number of test cases and an array for each test case.
 * For each test case, the program finds the first and last index of the target element in the array using recursion.
 * The program then prints the first and last index for each test case.
 * 
 * Author: Saifullah Mansoori
 */
package binary_search;

import java.util.Scanner;

public class first_Index_And_Last_Index__Recursion_2 {

    static Scanner input = new Scanner(System.in);

    public static void main(String arg[]) {
        // Getting the number of test cases from the user
        int test = input.nextInt();
        while (test-- > 0) {
            Helper(); // Call the helper function for each test case
        }
    }

    // Helper function to get input from the user and call the algorithm functions
    public static void Helper() {
        int n = input.nextInt(); // Number of elements in the array
        int arr[] = new int[n]; // Create an array to store the elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt(); // Input array elements
        }
        int target = input.nextInt(); // The number to find the first and last index of

        // Call the algorithm functions to find the first and last index and print the results
        int first = firstIndex(arr, target, 0, arr.length - 1, -1);
        int last = lastIndex(arr, target, 0, arr.length - 1, -1);
        System.out.print(first + " ");
        System.out.println(last);
    }

    // Function to find the first index of the target element in the sorted array using recursion
    private static int firstIndex(int[] arr, int key, int left, int right, int firstIndex) {
        if (left > right || left >= arr.length || right < 0) {
            return firstIndex;
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == key) {
            firstIndex = mid;
            // Continue searching in the left part of the array to find the first occurrence
            return firstIndex(arr, key, left, mid - 1, firstIndex);
        } else if (arr[mid] < key) {
            // Search in the right part of the array
            return firstIndex(arr, key, mid + 1, right, firstIndex);
        } else {
            // Search in the left part of the array
            return firstIndex(arr, key, left, mid - 1, firstIndex);
        }
    }

    // Function to find the last index of the target element in the sorted array using recursion
    private static int lastIndex(int[] arr, int key, int left, int right, int lastIndex) {
        if (left > right || left >= arr.length || right < 0) {
            return lastIndex;
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == key) {
            lastIndex = mid;
            // Continue searching in the right part of the array to find the last occurrence
            return lastIndex(arr, key, mid + 1, right, lastIndex);
        } else if (arr[mid] < key) {
            // Search in the right part of the array
            return lastIndex(arr, key, mid + 1, right, lastIndex);
        } else {
            // Search in the left part of the array
            return lastIndex(arr, key, left, mid - 1, lastIndex);
        }
    }
}
