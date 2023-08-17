package recursion;

import java.util.Scanner;

/**
 *
 * @author saifullah mansoori
 */
public class sum_of_Digit_7 {

    static Scanner input = new Scanner(System.in);

    public static void main(String arg[]) {
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int result = sumDigit(n);
            System.out.println(result);
        }
    }
    private static int sumDigit(int n)
    {
        if(n==0)
            return 0;
        
        return n%10+sumDigit(n/10);
    }
}
