package recursion;

import java.util.Scanner;

/**
 *
 * @author saifullah mansoori
 */
public class reverse_Number_8 {

    static Scanner input = new Scanner(System.in);

    public static void main(String arg[]) {
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            reverse(n);
            System.out.println(sum);
        }
    }
    static int sum=0;
    public static void reverse(int n)
    {
        if(n==0)
            return;
        
        int rem=n%10;
        sum=sum*10+rem;
        reverse(n/10);
    }
}
