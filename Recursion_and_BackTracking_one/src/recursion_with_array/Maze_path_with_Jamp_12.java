package recursion_with_array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author saifullah Mansoori
 */
public class Maze_path_with_Jamp_12 {

    static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int m = input.nextInt();
            ArrayList<String> paths = MazepathWithJamp(1, 1, n, m);
            System.out.println(paths);
        }
    }

    public static ArrayList<String> MazepathWithJamp(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> paths = new ArrayList<>();
        //horizontal move
        for (int hs = 1; hs <= dc - sc; hs++) {
            ArrayList<String> hpaths = MazepathWithJamp(sr, sc + hs, dr, dc);
            for (String hpath : hpaths) {
                paths.add("h" + hs + hpath);
            }
        }

        // vertical move
        for (int vs = 1; vs <= dr - sr; vs++) {
            ArrayList<String> vpaths = MazepathWithJamp(sr + vs, sc, dr, dc);
            for (String vpath : vpaths) {
                paths.add("h" + vs + vpath);
            }
        }

        //diognsld move
        for (int ds = 1; ds <= dr - sr && ds <= dc - sc; ds++) {
            ArrayList<String> dpaths = MazepathWithJamp(sr + ds, sc + ds, dr, dc);
            for(String dpath:dpaths)
            {
                paths.add("d"+ds+dpath);
            }
        }
        return paths;
    }
}
