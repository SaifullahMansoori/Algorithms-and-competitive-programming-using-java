package binary_search;

import java.util.Scanner;

public class binary_Search_Recursion {

    static Scanner input = new Scanner(System.in);

    public static void main(String arg[]) {
        // Getting the number of test case
        int test = input.nextInt();
        while (test-- > 0) {
            Helper();
        }
    }

    // Helper function to get input from the user and call the algorithm function
    private static void Helper() {
        int n = input.nextInt(); // Number of elements in the array
        int[] arr = new int[n]; // Create an array to store the elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt(); // Input array elements
        }
        int target = input.nextInt(); // The number to find the index for

        // Call the recursive function and save the result, then print it
        mergeSort(arr, 0, arr.length - 1); // Sort the array using Merge Sort
        int result = recursion_Binary_Search(arr, 0, arr.length - 1, target);
        System.out.println(result); // Print the index of the target
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid); // Sort the left half
            mergeSort(arr, mid + 1, right); // Sort the right half
            merge(arr, left, mid, right); // Merge the two sorted halves
        }
    }

    // Helper function to merge two sorted sub-arrays
    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        // Merge the temporary arrays back into arr[]
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArr[] if any
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArr[] if any
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    // Recursive Binary Search function to find the index of the target in the sorted array
    private static int recursion_Binary_Search(int arr[], int left, int right, int target) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid; // Target found, return the index
            } else if (arr[mid] < target) {
                // Search in the right part of the array
                return recursion_Binary_Search(arr, mid + 1, right, target);
            } else {
                // Search in the left part of the array
                return recursion_Binary_Search(arr, left, mid - 1, target);
            }
        }
        return -1; // Target not found, return -1
    }
}
