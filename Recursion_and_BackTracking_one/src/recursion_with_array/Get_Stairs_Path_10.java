package recursion_with_array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author saifu
 */
public class Get_Stairs_Path_10 {

    static Scanner input = new Scanner(System.in);

    public static void main(String arg[]) {
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            ArrayList<String> paths = getStairpath(n);
            System.out.println(paths);
        }
    }

    public static ArrayList<String> getStairpath(int n) {
        if(n==0)
        {
           ArrayList<String> bres=new ArrayList<>();
           return bres;
        }else if(n<0)
        {
             ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> path1 = getStairpath(n - 1);
        ArrayList<String> path2 = getStairpath(n - 2);
        ArrayList<String> path3 = getStairpath(n - 3);
        ArrayList<String> paths = new ArrayList<>();
        for (String path : path1) {
            paths.add(1 + path);
        }
        for (String path : path2) {
            paths.add(2 + path);
        }
        for (String path : path3) {
            paths.add(3 + path);
        }
        return paths;
    }
}
