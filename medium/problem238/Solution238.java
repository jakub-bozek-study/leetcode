package medium.problem238;

import java.util.Arrays;

public class Solution238 {

    // First try solution, working well, but exceed time limit on last testcase on leetcode website.
     public static int[] productExceptSelf(int[] nums) {
         int[] result = new int[nums.length];
         Arrays.fill(result, 1);

         for(int i = 0; i < nums.length; i++){

             for(int l = 0; l < i; l++){
                 result[i] *= nums[l];
             }

             for(int r = i + 1; r < nums.length; r++){
                 result[i] *= nums[r];
             }
         }

         return result;
     }

     // Better solution base on forum post. don't use nested for loop.
    public static int[] productExceptSelfBetter(int[] nums) {
        int n = nums.length;
        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];
        int[] result = new int[n];

        // Calculate left products
        leftProducts[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }

        // Calculate right products
        rightProducts[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
        }

        // Calculate the final result
        for (int i = 0; i < n; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] t1 = productExceptSelf(new int[]{1,2,3,4});
        int[] t2 = productExceptSelf(new int[]{-1,1,0,-3,3});

        System.out.println(Arrays.toString(t1));
        System.out.println(Arrays.toString(t2));
    }
}
