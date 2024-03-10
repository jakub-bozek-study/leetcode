package easy.problem268;

import java.util.*;

public class Solution268 {

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);

        if(nums[0] != 0) return 0;
        if(nums[nums.length - 1] != nums.length) return nums.length;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] != i){
                return i;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int t1 = missingNumber(new int[]{});
        int t2 = missingNumber(new int[]{});


        System.out.println(t1);
        System.out.println(t2);

    }
}
