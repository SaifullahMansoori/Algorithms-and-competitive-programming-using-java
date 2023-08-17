
package recursion;

import java.util.Scanner;

/**
 *
 * @author saifullah mansoori
 */
public class print_N_To_One_2 {
    static Scanner input = new Scanner(System.in);

    public static void main(String arg[]) {
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            print(n);

        }
    }
    public static void print(int n)
    {
        if(n==0)
            return;
        System.out.println(n);
        print(n-1);
    }
}
