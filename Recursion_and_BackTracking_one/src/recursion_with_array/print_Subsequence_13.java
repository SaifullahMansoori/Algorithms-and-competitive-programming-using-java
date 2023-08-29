package recursion_with_array;

import java.util.Scanner;

/**
 *
 * @author saifullah Mansoori
 */
public class print_Subsequence_13 {

    static Scanner input = new Scanner(System.in);

    public static void main(String arg[]) {
        int test = input.nextInt();
        while (test-- > 0) {
            String str = input.next();
            printSub(str, "");
        }
    }

    public static void printSub(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        String rsq = str.substring(1);
        printSub(rsq, ans + ch);
        printSub(rsq, ans + "");
    }
}
