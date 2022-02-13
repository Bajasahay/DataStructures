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
        System.out.println(check(new int[]{69,91,47,74,75,94,22,100,43,50,82,47,40,51,90,27,98,85,47,14,55,82,52,9,65,90,86,45,52,52,95,40,85,3,46,77,16,59,32,22,41,87,89,78,59,78,34,26,71,9,82,68,80,74,100,6,10,53,84,80,7,87,3,82,26,26,14,37,26,58,96,73,41,2,79,43,56,74,30,71,6,100,72,93,83,40,28,79,24}));
    }

    public static Integer check(int[] nums) {
        Integer count = 0;
        Integer maxOddFrequency = 0;
        Integer maxOdd = 0;

        for(int i= 0; i<nums.length ; i=i+2) {

        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                nums[i] = nums[i - 2];
                count = count + 1;
            }
            if (i >= 2) {
                if (nums[i - 2] != nums[i]) {
                    nums[i] = nums[i - 2];
                    count = count + 1;
                }
            }
        }
        return count;
    }
}
