
package recursion;

import java.util.Scanner;

/**
 *
 * @author saifullah
 */
public class print_One_To_N_1 {
    static Scanner input=new Scanner(System.in);
    public static void main(String arg[])
    {
        int test=input.nextInt();
        while(test-- >0)
        {
            int n=input.nextInt();
            print(n);
            
        }
    }
    public static void print(int n)
    {
        if(n==0)
            return;
        
        print(n-1);
        System.out.println(n);
    }
}
