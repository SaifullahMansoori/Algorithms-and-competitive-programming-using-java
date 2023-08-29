package recursion_with_array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author saifullah Mansoori
 */
public class N_Queens_21 {

    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int[][] chess = new int[n][n];
            Queens(chess, "", 0);

        }
    }

    public static void Queens(int chess[][], String psf, int row) {
        if (row == chess.length) {
            psf=psf.substring(0, psf.length()-3);
            System.out.println(psf);
            return;
        }
        for (int col = 0; col < chess.length; col++) {
            if (isQueenSave(chess, row, col) == true) {
                chess[row][col] = 1;
                Queens(chess, psf + row + "-" + col + " , ", row + 1);
                chess[row][col] = 0;
            }
        }
    }

    private static boolean isQueenSave(int[][] chess, int row, int col) {
        for (int i = row - 1, j = col; i >= 0; i--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
            if (chess[i][j] == 1) {
                return false;
            }
        }
        return true;
    }
}
