/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursion_with_array;

import java.util.Scanner;

/**
 *
 * @author saifullah Mansoori
 */
public class reverse_Print_Array_5 {

    static Scanner input = new Scanner(System.in);

    public static void main(String arg[]) {
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            Display(arr, arr.length - 1);
        }
    }

    private static void Display(int[] arr, int index) {

        if (index < 0) {
            return;
        }

        System.out.println(arr[index]);
        Display(arr, index - 1);
    }
}
