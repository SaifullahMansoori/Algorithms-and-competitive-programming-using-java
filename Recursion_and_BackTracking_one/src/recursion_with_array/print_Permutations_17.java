package recursion_with_array;

import java.util.Scanner;

/**
 *
 * @author saifullah Mansoori
 */
public class print_Permutations_17 {

    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            String str = input.next();
            printPermutations(str, "");
        }
    }

    private static void printPermutations(String str, String psf) {
        if(str.length()==0)
        {
            System.out.println(psf);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String qlpart = str.substring(0, i);
            String qrpart = str.substring(i + 1);
            String roq=qlpart+qrpart;
            printPermutations(roq,psf+ch);
        }
    }
}
