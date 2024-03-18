package easy.problem2656;

import java.util.Arrays;

public class Solution2656 {


    // My solution to this problem, using Arrays.sort, and sum last element K-times.
    public static int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int s = 0;
        int n = nums.length-1;

        for(int i = k; i != 0; i--){
            s += nums[n];
            nums[n]++;
        }

        return s;
    }

    // Faster solution finding max value in array in first loop, then just sum k-times increment value;
    // Solution from forum
    public int maximizeSumFaster(int[] nums, int k) {
        int max = nums[0];
        for (int m: nums)
            max = Math.max(m, max);
        int sum = max++;
        for (int i = 0; i < k - 1; i++)
            sum += max++;
        return sum;
    }

    public static void main(String[] args) {
        int t1 = maximizeSum(new int[]{1,2,3,4,5}, 3);
        int t2 = maximizeSum(new int[]{5,5,5}, 2);

        System.out.println(t1);
        System.out.println(t2);
    }
}
