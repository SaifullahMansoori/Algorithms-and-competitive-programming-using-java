package recursion_with_array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author saifullah Mansoori
 */
public class Maze_path_11 {

    static Scanner input = new Scanner(System.in);

    public static void main(String arg[]) {
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int m = input.nextInt();
            ArrayList<String> paths = getMazePath(1, 1, n, m);
            System.out.println(paths);
        }
    }

    public static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> bre = new ArrayList<>();
            bre.add("");
            return bre;
        }
        ArrayList<String> vpaths = new ArrayList<>();
        ArrayList<String> hpaths = new ArrayList<>();

        if (sc < dc) {
            hpaths = getMazePath(sr, sc + 1, dr, dc);
        }
        if (sr < dr) {
            vpaths = getMazePath(sr + 1, sc, dr, dc);
        }
        ArrayList<String> paths=new ArrayList<>();
        for (String hpath : hpaths) {
            paths.add("h" + hpath);
        }
        for (String vpath : vpaths) {
            paths.add("v" + vpath);
        }
        return paths;
    }
}
