/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursion_with_array;

import java.util.Scanner;

/**
 *
 * @author saifullah Mansoori
 */
public class print_Encodings_18 {

    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            String str = input.next();
            Encodings(str, "");
        }

    }

    public static void Encodings(String str, String psf) {
        if (str.length() == 0) {
            System.out.println(psf);
            return;
        } else if (str.length() == 1) {
            char ch = str.charAt(0);
            if (ch == '0') {
                return;
            } else {
                int chv = ch - '0';
                char code = (char) ('a' + chv - 1);
                System.out.println(psf+code);
            }
        } else {
            char ch = str.charAt(0);
            String roq = str.substring(1);
            if (ch == '0') {
                return;
            } else {
                int chv = ch - '0';
                char code = (char) ('a' + chv - 1);
                Encodings(roq, psf + code);
            }

            String ch12 = str.substring(0, 2);
            String roq12 = str.substring(2);

            int ch12v = Integer.parseInt(ch12);
            if (ch12v <= 26) {
                char code = (char) ('a' + ch12v - 1);
                Encodings(roq12, psf + code);
            }
        }

    }
}
