package easy.problem977;

import java.util.Arrays;

public class Solution977 {

    public static int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        int[] t1 = sortedSquares(new int[]{-4,-1,0,3,10});
        int[] t2 = sortedSquares(new int[]{4,9,9,49,121});

        System.out.println(Arrays.toString(t1));
        System.out.println(Arrays.toString(t2));
    }
}
