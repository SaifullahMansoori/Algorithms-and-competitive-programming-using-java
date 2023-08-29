package recursion_with_array;

import java.util.Scanner;

/**
 *
 * @author saifullah Mansoori
 */
public class Knights_Tour_22 {

    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[][] chess = new int[n][n];
            int row = input.nextInt();
            int col = input.nextInt();
            KnightsTour(chess, row, col, 1);
        }
    }

    public static void KnightsTour(int[][] chess, int row, int col, int move) {
        if (row < 0 || col < 0 || row >= chess.length || col >= chess[0].length || chess[row][col] > 0) {
            return;
        }else if(move==chess.length*chess.length)
        {
            chess[row][col] = move;
            Display(chess);
            chess[row][col]=0;
            return;
        }
        chess[row][col] = move;
        KnightsTour(chess, row - 2, col + 1, move + 1);
        KnightsTour(chess, row - 1, col + 2, move + 1);
        KnightsTour(chess, row + 1, col + 2, move + 1);
        KnightsTour(chess, row + 2, col + 1, move + 1);
        KnightsTour(chess, row + 2, col - 1, move + 1);
        KnightsTour(chess, row + 1, col - 2, move + 1);
        KnightsTour(chess, row - 1, col - 2, move + 1);
        KnightsTour(chess, row - 2, col - 1, move + 1);
        chess[row][col] = 0;
    }

    public static void Display(int[][] chess) {
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                System.out.print(chess[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
