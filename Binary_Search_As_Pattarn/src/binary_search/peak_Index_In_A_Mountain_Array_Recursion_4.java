
package binary_search;

import java.util.Scanner;

/**
 *
 * @author Saifullah Mansoori
 */
public class peak_Index_In_A_Mountain_Array_Recursion_4 {

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
        int result = Index_In_A_Mountain_Array_Recursion(arr, 0, arr.length - 1);
        System.out.println(result);
    }

    private static int Index_In_A_Mountain_Array_Recursion(int[] arr, int left, int right) {
        if (left == right) {
            return arr[right];
        }
        int mid=left+(right-left)/2;
        if(arr[mid]>arr[mid+1])
        {
            return Index_In_A_Mountain_Array_Recursion(arr,left,mid);
        }
        else
        {
            return Index_In_A_Mountain_Array_Recursion(arr,mid+1,left);
        }
    }
}
