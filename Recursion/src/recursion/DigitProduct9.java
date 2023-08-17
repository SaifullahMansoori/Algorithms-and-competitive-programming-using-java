package recursion;

import java.util.Scanner;

/**
 *
 * @author saifullah Mansoori
 */
public class DigitProduct9 {

    static Scanner input = new Scanner(System.in);

    public static void main(String arg[]) {
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int result = Product(n);
            System.out.println(result);
        }
    }

    public static int Product(int n) {
        if (n % 10 == n) {
            return n;
        }
        return n % 10 * Product(n / 10);
    }
}
