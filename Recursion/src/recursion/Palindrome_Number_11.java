
package recursion;

import java.util.Scanner;

/**
 *
 * @author saifullah Mansoori
 */
public class Palindrome_Number_11 {
        static Scanner input = new Scanner(System.in);

    public static void main(String arg[]) {
        int test = input.nextInt();
        while (test-- > 0) {
            int n=input.nextInt();
            Reverse(n);
            System.out.println(sum==n);
        }
    }
    static int sum=0;
    private static void Reverse(int n) {
        if(n==0)
            return;
        
        int rem=n%10;
        
        sum=sum*10+rem;
        Reverse(n/10);
    }
}
