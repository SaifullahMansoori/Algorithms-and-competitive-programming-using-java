package recursion;

import java.util.Scanner;

/**
 *
 * @author saifullah mansoori
 */
public class sum_of_N_number_6 {

    static Scanner input = new Scanner(System.in);

    public static void main(String arg[]) {
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int result = sum(n);
            System.out.println(result);
        }
    }

    private static int sum(int n) {
        if (n < 1) {
            return 0;
        }
        return n + sum(n - 1);
    }
}
