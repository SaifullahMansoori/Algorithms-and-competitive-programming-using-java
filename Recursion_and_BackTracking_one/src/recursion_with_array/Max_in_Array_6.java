package recursion_with_array;

import java.util.Scanner;

/**
 *
 * @author saifullah Mansoori
 */
public class Max_in_Array_6 {

    static Scanner input = new Scanner(System.in);

    public static void main(String arg[]) {
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = input.nextInt();
            }
            int index=MAX(arr,0);
            System.out.println(index);
        }
    }

    public static int MAX(int arr[], int index) {
        if(index==arr.length)
        {
            return arr[index];
        }
        int mis=MAX(arr,index+1);
        
        if(mis>arr[index])
        {
            return mis;
        }
        else
        {
            return arr[index];
        }
    }
}
