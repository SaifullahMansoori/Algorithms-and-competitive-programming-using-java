/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursion_with_array;

import java.util.Scanner;

/**
 *
 * @author saifu
 */
public class findIndex_2 {
    static Scanner input=new Scanner(System.in);
    public static void main(String arg[])
    {
        int test=input.nextInt();
        while(test-- >0)
        {
            int n=input.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=input.nextInt();
            }
            int target=input.nextInt();
            System.out.println(find(arr,target,0));
        }
    }
    private static int find(int[] arr,int target,int index)
    {
        if(index==arr.length-1)
        {
            return -1;
        }
        if(arr[index]==target)
        {
            return index;
        }
        return find(arr,target,index+1);
    }
}
