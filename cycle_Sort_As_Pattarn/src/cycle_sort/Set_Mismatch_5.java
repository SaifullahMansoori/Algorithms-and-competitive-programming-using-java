/**
 * You have a set of integers s, which originally contains all the numbers from 1 to n.
 * Unfortunately, due to some error, one of the numbers in s got duplicated to another number in
 * the set, which results in the repetition of one number and the loss of another number.
 * You are given an integer array nums representing the data status of this set after the error.
 * Find the number that occurs twice and the number that is missing and return them in the form of an array.
 * Author: Saifullah
 */
package cycle_sort;

import java.util.Scanner;

public class Set_Mismatch_5 {
    static Scanner input = new Scanner(System.in);

    public static void main(String arg[]) {
        int test = input.nextInt(); // Get the number of test cases

        // Execute the Mismatch() method for each test case
        while (test-- > 0) {
            Mismatch();
        }
    }

    private static void Mismatch() {
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
            if (nums[i] != nums[correct]) {
                Swap(nums, i, correct);
            } else {
                // If the element is already in its correct position, move to the next element
                i++;
            }
        }

        // Check for the mismatched numbers by comparing each element with its index+1
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                System.out.println(nums[index]); // Print the duplicated number
                System.out.println(index + 1); // Print the missing number
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
