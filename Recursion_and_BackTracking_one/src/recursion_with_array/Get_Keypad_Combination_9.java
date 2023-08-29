package recursion_with_array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author saifullah Mansoori
 */
public class Get_Keypad_Combination_9 {

    static Scanner input = new Scanner(System.in);

    public static void main(String arg[]) {
        int test = input.nextInt();
        while (test-- > 0) {
            String str = input.next();
            ArrayList<String> words = getKPC(str);
            System.out.println(words);
        }
    }
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0)
        {
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = getKPC(ros);
        ArrayList<String> mres = new ArrayList<>();

        String codeforCH = codes[ch-'0'];
        for (int i = 0; i < codeforCH.length(); i++) {
            char chcode = codeforCH.charAt(i);
            for(String rstr:rres)
            {
                mres.add(chcode+rstr);
            }
        }
        return mres;
    }
}
