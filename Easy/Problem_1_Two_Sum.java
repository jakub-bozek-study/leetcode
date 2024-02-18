package Easy;

/*
* https://leetcode.com/problems/two-sum/description/
*
* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
* You may assume that each input would have exactly one solution, and you may not use the same element twice.
* You can return the answer in any order.
*
* */

import java.util.HashMap;
import java.util.Map;

public class Problem_1_Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                break;
            }
            map.put(nums[i], i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] t1 = twoSum(new int[]{2, 7, 11, 15}, 9);
        int[] t2 = twoSum(new int[]{3, 2, 4}, 6);
        int[] t3 = twoSum(new int[]{3, 3}, 6);

        System.out.println("["+t1[0]+","+t1[1]+"]");
        System.out.println("["+t2[0]+","+t2[1]+"]");
        System.out.println("["+t3[0]+","+t3[1]+"]");
    }

}
