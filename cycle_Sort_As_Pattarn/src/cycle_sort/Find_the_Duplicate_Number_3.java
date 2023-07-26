/*
 * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
 * There is only one repeated number in nums, return this repeated number.
 * You must solve the problem without modifying the array nums and uses only constant extra space.


 * Author: Saifullah Mansoori
 */
package cycle_sort;

import java.util.Arrays;
import java.util.Scanner;

public class Find_the_Duplicate_Number_3 {

    static Scanner input = new Scanner(System.in);

    public static void main(String arg[]) {
        int test = input.nextInt(); // Get the number of test cases

        // Execute the Duplicate() method for each test case
        while (test-- > 0) {
            Duplicate();
        }
    }

    private static void Duplicate() {
        int n = input.nextInt(); // Get the size of the array
        int nums[] = new int[n];

        // Input the elements of the array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }

        int i = 0;

        // Perform the Cycle Sort algorithm to place each element at its correct position
        while (i < nums.length) {
            int correct = nums[i] - 1; // The correct position of the current element

            // If the element is not in its correct position, swap it to the correct position
            if (nums[i] != nums[correct]) {
                Swap(nums, i, correct);
            } else {
                // If the element is already in its correct position, move to the next element
                i++;
            }
        }

        // Check for the duplicate number by comparing each element with its index+1
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                System.out.println(nums[index]); // Print the duplicate number
            }
        }
    }

    // A utility method to swap two elements in an array
    private static void Swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
