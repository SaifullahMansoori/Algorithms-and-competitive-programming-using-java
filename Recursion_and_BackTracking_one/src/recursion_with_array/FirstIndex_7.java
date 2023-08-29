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
public class FirstIndex_7 {

    static Scanner input = new Scanner(System.in);

    public static void main(String arg[]) {
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = input.nextInt();
            }
            int target = input.nextInt();
            int index = find(arr, 0, target);
            System.out.println(index);
        }
    }

    private static int find(int[] arr, int index, int target) {

        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        
        else
        {
            int temp = find(arr, index + 1, target);
            return temp;
        }
    }
}
