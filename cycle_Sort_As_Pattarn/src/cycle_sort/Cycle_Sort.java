package cycle_sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This program demonstrates the Cycle Sort algorithm to sort an array.
 * Cycle Sort is an in-place and unstable sorting algorithm known for its
 * optimal number of writes to the array, making it useful for memory-limited scenarios.
 * It works by arranging elements in their correct positions one at a time.
 * 
 * 
 * Author: Saifullah Mansoori
 */
public class Cycle_Sort {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int test = input.nextInt(); // Get the number of test cases

        // Execute the Cycle() method for each test case
        while (test-- > 0) {
            Cycle();
        }
    }

    public static void Cycle() {
        int n = input.nextInt(); // Get the size of the array
        int[] nums = new int[n];

        // Input the elements of the array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }

        int i = 0;

        // Perform the Cycle Sort algorithm
        while (i < nums.length) {
            int correct = nums[i] - 1; // The correct position of the current element
            System.out.println(correct);
            // If the element is not in its correct position, swap it to the correct position
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                // If the element is already in its correct position, move to the next element
                i++;
            }
        }

        // Print the sorted array for the current test case
        System.out.println(Arrays.toString(nums));
    }

    // A utility method to swap two elements in an array
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
