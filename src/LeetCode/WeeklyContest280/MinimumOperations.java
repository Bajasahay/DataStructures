package LeetCode.WeeklyContest280;

public class MinimumOperations {
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
