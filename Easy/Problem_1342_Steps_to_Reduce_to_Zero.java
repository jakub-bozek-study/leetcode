package Easy;

/*
 * https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
 *
 * Given an integer num, return the number of steps to reduce it to zero.
 * In one step, if the current number is even, you have to divide it by 2,
 * otherwise, you have to subtract 1 from it.
 *
 * */

public class Problem_1342_Steps_to_Reduce_to_Zero {

    public static int numberOfSteps(int num) {
        int step = 0;

        while(num > 0){
            if(num%2 == 0){
                num /= 2;
                step++;
            } else {
                num--;
                step++;
            }
        }

        return step;
    }

    public static void main(String[] args) {
        int t1 = numberOfSteps(14);
        int t2 = numberOfSteps(8);
        int t3 = numberOfSteps(123);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
