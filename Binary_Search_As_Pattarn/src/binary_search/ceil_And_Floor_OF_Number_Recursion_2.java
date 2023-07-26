package binary_search;

import java.util.Scanner;

/**
 * This program demonstrates finding the ceiling and floor of a number in a sorted array using recursion.
 * Ceiling: The smallest element in the array that is greater than or equal to the target.
 * Floor: The greatest element in the array that is less than or equal to the target.
 * 
 * The user inputs the number of test cases and the array elements for each test case.
 * For each test case, the program finds the ceiling and floor of the given target in the array and prints the results.
 * If the target is not found in the array, the program returns the next greater element for ceiling and the previous smaller element for floor, if available.
 * If no greater element is found for ceiling or no smaller element is found for floor, it returns a specific value (-1 in this case) to indicate that the target is not found.
 * 
 * 
 * 
 * @author Saifullah Mansoori
 */
public class ceil_And_Floor_OF_Number_Recursion_2 {

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
        int target = input.nextInt(); // The number to find the ceiling and floor for
        int ceil = ceiling(arr, target, 0, arr.length - 1); // Find the ceiling using binary search
        int floor = floor(arr, target, 0, arr.length - 1); // Find the floor using binary search
        System.out.println(floor); // Print the floor value
        System.out.println(ceil); // Print the ceiling value
    }

    // Recursive function to find the ceiling of the target in the array using binary search
    private static int ceiling(int[] arr, int target, int left, int right) {
        if (left > right) {
            // Target not found, return the next greater element (if available)
            if (left < arr.length)
                return arr[left];
            else
                return -1; // Or some value to indicate target not found
        }

        int mid = left + (right - left) / 2; // Calculate the middle index
        if (arr[mid] == target) {
            return mid; // Target found, return the index
        } else if (arr[mid] < target) {
            // Search in the right part of the array
            return ceiling(arr, target, mid + 1, right);
        } else {
            // Search in the left part of the array
            return ceiling(arr, target, left, mid - 1);
        }
    }

    // Recursive function to find the floor of the target in the array using binary search
    private static int floor(int[] arr, int target, int left, int right) {
        if (left > right) {
            // Target not found, return the previous smaller element (if available)
            if (right >= 0)
                return arr[right];
            else
                return -1; // Or some value to indicate target not found
        }

        int mid = left + (right - left) / 2; // Calculate the middle index
        if (arr[mid] == target) {
            return mid; // Target found, return the index
        } else if (arr[mid] < target) {
            // Search in the right part of the array
            return floor(arr, target, mid + 1, right);
        } else {
            // Search in the left part of the array
            return floor(arr, target, left, mid - 1);
        }
    }
}
