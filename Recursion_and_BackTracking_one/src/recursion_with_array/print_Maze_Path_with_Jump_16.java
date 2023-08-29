package recursion_with_array;

import java.util.Scanner;

/**
 *
 * @author saifullah Mansoori
 */
public class print_Maze_Path_with_Jump_16 {

    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            int drow = input.nextInt();
            int dcol = input.nextInt();
            PrintMazePathwithJump(1, 1, drow, dcol, "");
        }
    }

    public static void PrintMazePathwithJump(int sr, int sc, int dr, int dc, String psf) {

        if (sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }

        //horizntal move
        for (int hm = 1; hm <= dc - sc; hm++) {
            PrintMazePathwithJump(sr, sc + hm, dr, dc, psf + "h" + hm);
        }
        //vertical move
        for (int vm = 1; vm <= dr - sr; vm++) {
            PrintMazePathwithJump(sr + vm, sc, dr, dc, psf + "v" + vm);
        }

        //diognal move
        for (int dm = 1; dm <= dc - sc && dm <= dr - sr; dm++) {
            PrintMazePathwithJump(sr + dm, sc + dm, dr, dc, psf + "d" + dm);
        }
    }
}
