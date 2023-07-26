/*
 * Given an array nums of n integers where nums[i] is in the range [1, n],
 * return an array of all the integers in the range [1, n] that do not appear in nums.


 * Author: Saifullah Mansoori
 */
package cycle_sort;

import java.util.Arrays;
import java.util.Scanner;

public class Find_All_Numbers_Disappeared_in_an_Array_2 {

    static Scanner input = new Scanner(System.in);

    public static void main(String arg[]) {
        int test = input.nextInt(); // Get the number of test cases

        // Execute the Disappeared() method for each test case
        while (test-- > 0) {
            Disappeared();
        }
    }

    private static void Disappeared() {
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


        // Check for the missing numbers by comparing each element with its index+1
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
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
