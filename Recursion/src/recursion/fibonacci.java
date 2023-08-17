
package recursion;

import java.util.Scanner;

/**
 *
 * @author saifu
 */
public class fibonacci {
    static Scanner input=new Scanner(System.in);
    public static void main(String arg[])
    {
        int test=input.nextInt();
        while(test-- >0)
        {
            int n=input.nextInt();
            int ans=fib(n);
            System.out.println(ans);
        }
    }    
    public static int fib(int n)
    {
        if(n<2)
            return n;
        return fib(n-1)+fib(n-2);
    }
}
