package recursion;

import java.util.Scanner;

/**
 *
 * @author saifullah Mansoori
 */
public class count_Step_to_Reduce_number_to_Zero_13 {

    static Scanner input = new Scanner(System.in);

    public static void main(String arg[]) {
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();

            int count = Reduce(n, 0);
            System.out.println(count);
        }
    }

    public static int Reduce(int number, int step) {
        if (number == 0) {
            return step;
        }
        if (number % 2 == 0) {
            return Reduce(number / 2, step + 1);
        } else {
            return Reduce(number - 1, step + 1);
        }
    }
}
