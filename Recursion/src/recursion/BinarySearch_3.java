package recursion;

import java.util.Scanner;

/**
 *
 * @author saifullah mansoori
 */
public class BinarySearch_3 {

    static Scanner input = new Scanner(System.in);

    public static void main(String arg[]) {
        int test = input.nextInt();
        while (test-- > 0) {
            Helper();
        }
    }

    public static void Helper() {
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int target = input.nextInt();
        Sort(arr);
        int index = BinarySearch(arr, 0, arr.length - 1, target);
        System.out.println(index);
    }

    private static int BinarySearch(int arr[], int low, int high, int target) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;
        if (arr[mid] < target) {
            return BinarySearch(arr, mid + 1, high, target);
        } else if (arr[mid] > target) {
            return BinarySearch(arr, low, mid - 1, target);
        } else {
            return mid;
        }
    }

    private static void Sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
