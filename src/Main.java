import CodeStudio.Permutation;
import CodeStudio.Trade;
import Recursion.RecursionMain;
import Tree.TreeMain;

import javax.swing.*;

public class Main {
    public static void main(String args[]) {
        System.out.println("Main Method");
//        TreeMain treeMain = new TreeMain();
//        treeMain.executeCode();
//        RecursionMain recursionMain = new RecursionMain();
//        recursionMain.executeCode();

//        System.out.println(remove("CABABD"));
//        Trade trade = new Trade();
//        System.out.println(trade.tradeSolution(6l));
        Permutation permutation = new Permutation();
        permutation.costToProcess(5, new int[]{1, 3, 5, 4, 2});
    }

    public static String remove(String str)
    {
        if (str == null) {
            return null;
        }

        char[] chars = str.toCharArray();
        int i = 0, k = 0;

        while (i < str.length())
        {
            if (    chars[i] == 'B' && (k > 0 && chars[k - 1] == 'A') ||
                    chars[i] == 'A' && (k > 0 && chars[k - 1] == 'B') ||
                    chars[i] == 'C' && (k > 0 && chars[k - 1] == 'D') ||
                    chars[i] == 'D' && (k > 0 && chars[k - 1] == 'C'))
            {
                --k;
                ++i;
            }
            else {
                chars[k++] = chars[i++];
            }
        }

        return new String(chars).substring(0, k);
    }
}
