package Easy;

/*
 * https://leetcode.com/problems/number-of-good-pairs/description/
 *
 * Given an array of integers nums, return the number of good pairs.
 * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 *
 * */

public class Problem_1512_Number_of_Good_Pairs {

    public static int numIdenticalPairs(int[] nums) {
        if(nums.length == 1) return 0;

        int res = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 1; j < nums.length; j++){
                if(i < j && nums[i] ==  nums[j]){
                    res++;
                }
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int t1 = numIdenticalPairs(new int[]{1,2,3,1,1,3});
        int t2 = numIdenticalPairs(new int[]{1,1,1,1});
        int t3 = numIdenticalPairs(new int[]{1,2,3});

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }



}
