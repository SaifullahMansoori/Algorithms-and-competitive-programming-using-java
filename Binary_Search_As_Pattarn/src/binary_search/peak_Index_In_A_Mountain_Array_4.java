/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binary_search;

import java.util.Scanner;

/**
 *
 * @author Saifullah Mansoori
 */
public class peak_Index_In_A_Mountain_Array_4 {
    static Scanner input=new Scanner(System.in);
    public static void main(String arg[])
    {
        int test=input.nextInt();
        while(test-- >0)
        {
            Helper();
        }
    }
    private static void Helper()
    {
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=input.nextInt();
        }
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]>arr[mid+1])
            {
                right=mid;
            }
            else
            {
                left=mid+1;
            }
        }
        System.out.println(arr[left]);
    }
}
