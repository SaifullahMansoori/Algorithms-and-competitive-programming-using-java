package recursion_with_array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author saifullah Mansoori
 */
public class print_Maze_Paths_15 {

    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            int drow = input.nextInt();
            int dcol = input.nextInt();
            mazePaths(1, 1, drow, dcol, "");
        }
    }
    static ArrayList<String> paths=new ArrayList<>();
    public static void mazePaths(int sr, int sc, int dr, int dc, String psf) {
        if (sr > dr || sc > dc) {
            return;
        }
        if (sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }
        mazePaths(sr, sc + 1, dr, dc, psf + "h");
        mazePaths(sr + 1, sc, dr, dc, psf + "v");
    }
}
