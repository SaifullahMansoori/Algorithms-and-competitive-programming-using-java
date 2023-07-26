package binary_search;

import java.util.Scanner;

/**
 * This program demonstrates binary search on a sorted array.
 * The user inputs the number of test cases and an array for each test case.
 * For each test case, the program sorts the array using an optimized sorting algorithm,
 * and then performs binary search to find the index of the target element in the array.
 * If the target element is found, it prints its index; otherwise, it prints -1.
 * 
 * The binary search algorithm assumes that the input array is sorted in ascending order.
 * If the array is not sorted, the binary search will not work correctly.
 * 
 * The optimized sorting algorithm used here is the "Merge Sort" algorithm.
 * Merge Sort is a divide-and-conquer algorithm with a time complexity of O(n log n).
 * It is more efficient than the previous sorting algorithm (bubble sort) used in the original code.
 * 
 * Author: Saifullah Mansoori
 */
public class binary_Search {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
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
        int target = input.nextInt(); // The number to find the index for
        mergeSort(arr, 0, arr.length - 1); // Sort the array using Merge Sort
        int index = binarySearch(arr, target); // Find the index of the target using binary search
        System.out.println(index); // Print the index of the target
    }

    // Recursive Merge Sort function to sort the array
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
        for (int i = 0; i < n1; i++)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            rightArr[j] = arr[mid + 1 + j];

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

    // Binary Search function to find the index of the target in the sorted array
    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid; // Target found, return the index
            } else if (arr[mid] < target) {
                // Search in the right part of the array
                left = mid + 1;
            } else {
                // Search in the left part of the array
                right = mid - 1;
            }
        }
        return -1; // Target not found, return -1
    }
}
