/**
 * Given an unsorted integer array nums, return the smallest missing positive integer.
 * You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
 * Author: Saifullah Mansoori
 */
package cycle_sort;

import java.util.Scanner;

public class First_Missing_Positive_6 {
    static Scanner input = new Scanner(System.in);

    public static void main(String arg[]) {
        int test = input.nextInt(); // Get the number of test cases

        // Execute the Missing_Positive() method for each test case
        while (test-- > 0) {
            Missing_Positive();
        }
    }

    private static void Missing_Positive() {
        int n = input.nextInt(); // Get the size of the array
        int[] nums = new int[n];

        // Input the elements of the array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }

        int i = 0;

        // Perform the Cycle Sort algorithm to place each element at its correct position
        while (i < nums.length) {
            int correct = nums[i] - 1; // The correct position of the current element

            // If the element is not in its correct position, swap it to the correct position
            if (nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[correct]) {
                Swap(nums, i, correct);
            } else {
                // If the element is already in its correct position or out of range, move to the next element
                i++;
            }
        }

        // Check for the smallest missing positive integer by comparing each element with its index+1
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                System.out.println(index + 1); // Print the smallest missing positive integer
                return; // Return immediately after finding the missing integer
            }
        }

        // If all positive integers from 1 to n are present, the smallest missing positive integer is n+1
        System.out.println(n + 1);
    }

    // A utility method to swap two elements in an array
    private static void Swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
