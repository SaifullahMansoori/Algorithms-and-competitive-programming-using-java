
package recursion_with_array;

import java.util.Scanner;

/**
 *
 * @author saifullah Mansoori
 */
public class printTairPaths_14 {
    static Scanner input=new Scanner(System.in);
    public static void main(String arg[])
    {
        int test=input.nextInt();
        while(test-- >0)
        {
            int n=input.nextInt();
            printPath(n,"");
        }
    }
    public static void printPath(int n,String psf)
    {
        if(n<0)
        {
            return;
        }
        if(n==0)
        {
            System.out.println(psf);
            return;
        }
        printPath(n-1,psf+"1");
        printPath(n-2,psf+"2");
        printPath(n-3,psf+"3");
    }
}
