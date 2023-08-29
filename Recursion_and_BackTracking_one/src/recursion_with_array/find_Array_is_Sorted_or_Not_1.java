package recursion_with_array;

import java.util.Scanner;

/**
 *
 * @author saifullah Mansoori
 */
public class find_Array_is_Sorted_or_Not_1 {

    static Scanner input = new Scanner(System.in);

    public static void main(String arg[]) {
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = input.nextInt();
            }
            boolean check = Sorted(arr, 0);
            System.out.println(check);
        }
    }

    private static boolean Sorted(int[] arr, int index) {
        if (index == arr.length-1) {
            return true;
        }
        return arr[index] <= arr[index + 1] && Sorted(arr, index + 1);
    }
}
