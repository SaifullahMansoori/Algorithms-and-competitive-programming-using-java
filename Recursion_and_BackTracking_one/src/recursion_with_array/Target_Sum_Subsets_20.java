
package recursion_with_array;

import java.util.Scanner;

/**
 *
 * @author saifullah mansoori
 */
public class Target_Sum_Subsets_20 {
    public static void  main(String arg[])
    {
       Scanner input=new Scanner(System.in);
       int test=input.nextInt();
       while(test-- >0)
       {
           int n=input.nextInt();
           int[]arr=new int[n];
           for(int i=0;i<n;i++)
           {
               arr[i]=input.nextInt();
           }
           int target=input.nextInt();
           sumSubSet(arr,0,"",0,target);
       }
    }
    public static void sumSubSet(int[] arr,int index,String sets,int sum,int target)
    {
        if(index==arr.length)
        {
            if(sum==target)
            {
                System.out.println(sets+".");
            }
            return;
        }
        
       sumSubSet(arr,index+1,sets+arr[index]+" , ",sum+arr[index],target);
       sumSubSet(arr,index+1,sets,sum,target);
    }
}
