package easy.problem1470;

/*
 * https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
 *
 * Given an integer num, return the number of steps to reduce it to zero.
 * In one step, if the current number is even, you have to divide it by 2,
 * otherwise, you have to subtract 1 from it.
 *
 * */

import java.util.Arrays;

public class Solution1470 {


    // My solution to problem using new int[] to store correct solution.
    public static int[] shuffle(int[] nums, int n) {
        int length = nums.length;
        int[] result = new int[2 * n];

        for(int i = 0; i < length; i+=2){
            result[i] = nums[i - (i / 2)];
            result[i + 1] = nums[n + (i / 2)];
        }

        return result;
    }


    // Solution from internet, don't create new array to store a result, use tricky idea of multiple value by 1024
    public int[] shuffleBetter(int[] nums, int n) {
        int len = nums.length;

        // to store the pair of numbers in right half of the original array
        for(int i = n; i < len; i++) {
            nums[i] = (nums[i] * 1024) + nums[i - n];
        }

        int index = 0;
        // to retrive values from the pair of numbers and placing those retrieved value at their desired position
        for(int i = n; i < len; i++, index += 2) {
            nums[index] = nums[i] % 1024;
            nums[index + 1] = nums[i] / 1024;
        }

        return nums;
    }

    //Internet solution using bitwise operator. A bit faster than previous. Just save for future, when learn more about bitwise
    public int[] shuffleBitwise(int[] nums, int n) {

        int len = nums.length;

        for(int i = n; i < len; i++) {
            nums[i] = (nums[i] << 10) | nums[i - n];
        }

        int index = 0;
        for(int i = n; i < len; i++, index += 2) {
            nums[index] = nums[i] & 1023;
            nums[index + 1] = nums[i] >>> 10;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] t1 = shuffle(new int[]{2,5,1,3,4,7}, 3);
        int[] t2 = shuffle(new int[]{1,2,3,4,4,3,2,1}, 4);
        int[] t3 = shuffle(new int[]{1,1,2,2}, 2);

        System.out.println(Arrays.toString(t1));
        System.out.println(Arrays.toString(t2));
        System.out.println(Arrays.toString(t3));
    }
}
