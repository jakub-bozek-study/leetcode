package Easy;

/*
 * https://leetcode.com/problems/running-sum-of-1d-array/description/
 *
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
 *
 * */

public class Problem_1480_Sum_of_1d_Array {

    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];

        for(int i = 1; i < nums.length; i++){
            result[i] = result[i-1] + nums[i];
        }

        return result;
    }

    public static void solutionToString(int[] solution){
        System.out.print("[");

        for(int i = 0; i < solution.length; i++){
            if(i == solution.length - 1){
                System.out.print(solution[i]+"]");
            } else {
                System.out.print(solution[i] + ", ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[] t1 = runningSum(new int[]{1,2,3,4});
        int[] t2 = runningSum(new int[]{1,1,1,1,1});
        int[] t3 = runningSum(new int[]{3,1,2,10,1});

        solutionToString(t1);
        solutionToString(t2);
        solutionToString(t3);
    }
}
