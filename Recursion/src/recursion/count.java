/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursion;

import java.util.Scanner;

/**
 *
 * @author saifullah mansoori
 */
public class count {

    static Scanner input = new Scanner(System.in);

    public static void main(String arg[]) {
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int target = input.nextInt();
            int result = numberCount(n, target, 0);
            System.out.println("result  " + result);

        }
    }

    private static int numberCount(int n, int target, int c) {

        if (n == 0) {
            return c;
        }
        int rem = n % 10;
        if (rem == target) {
            return numberCount(n / 10, target, c + 1);
        }
        return numberCount(n / 10, target, c);
    }
}
