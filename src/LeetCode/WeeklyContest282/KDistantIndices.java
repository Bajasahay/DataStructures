package LeetCode.WeeklyContest282;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KDistantIndices {

    public void distantIndices(int[] nums, int key, int k) {
        List<Integer> integerList = new ArrayList<>();
        for(int i = 0; i< nums.length; i++) {
                for( int j = 0; j<nums.length; j++) {
                    if(Math.abs(i-j)<=k && nums[j]==key) {
                        integerList.add(j);
                        break;
                    }
            }
        }
        Collections.sort(integerList);
        integerList.forEach( integer -> System.out.println(integer));
    }
}
