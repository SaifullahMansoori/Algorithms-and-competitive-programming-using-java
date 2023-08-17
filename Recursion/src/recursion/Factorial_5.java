package recursion;

import java.util.Scanner;

/**
 *
 * @author saifullah mansoori
 */
public class Factorial_5 {

    static Scanner input = new Scanner(System.in);

    public static void main(String arg[]) {
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int result = fact(n);
            System.out.println(result);
        }
    }

    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
