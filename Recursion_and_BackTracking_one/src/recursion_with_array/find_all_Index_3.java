package recursion_with_array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author saifullah Mansoori
 */
public class find_all_Index_3 {

    static Scanner input = new Scanner(System.in);

    public static void main(String arg[]) {
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            int target = input.nextInt();
            find(arr, 0, target);
            System.out.println(indexs);
        }
    }
    static ArrayList<Integer> indexs = new ArrayList<>();

    private static void find(int arr[], int index, int target) {
        if (index == arr.length - 1) {
            return;
        }
        if (arr[index] == target) {
            indexs.add(index);
        }
        find(arr, index + 1, target);
    }

}
