package LeetCode.WeeklyContest280;

public class CountOperations {

    public static Integer check(Integer num1, Integer num2) {
        Integer count = 0;
        while(num1!=0 && num2!=0){
            if(num1>=num2) {
                num1 = num1-num2;
            } else {
                num2 = num2-num1;
            }
            count = count+1;
        }
        return count;
    }
}
