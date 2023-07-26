package cycle_sort;

/*
 * Given an array nums containing n distinct numbers in the range [0, n],
 * return the only number in the range that is missing from the array.


 * Author: Saifullah Mansoori
 */
import java.util.Scanner;

public class Missing_Number_1 {

    static Scanner input = new Scanner(System.in);

    public static void main(String arg[]) {
        int test = input.nextInt(); // Get the number of test cases

        // Execute the Missing() method for each test case
        while (test-- > 0) {
            Missing();
        }
    }

    public static void Missing() {
        int n = input.nextInt(); // Get the size of the array
        int[] nums = new int[n];

        // Input the elements of the array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }

        int i = 0;

        // Perform the Cycle Sort algorithm to place each element at its correct position
        while (i < nums.length) {
            int correct = nums[i];

            // If the element is within the array bounds and not in its correct position, swap it
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                // Otherwise, move to the next element
                i++;
            }
        }

        // Check for the missing number by comparing each element with its index
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                System.out.println(index); // Print the missing number and return
                return;
            }
        }

        // If no missing number is found, then n is the missing number
        System.out.println(nums.length);
    }

    // A utility method to swap two elements in an array
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
