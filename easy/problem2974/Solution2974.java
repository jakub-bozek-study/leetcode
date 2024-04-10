package easy.problem2974;

import java.util.Arrays;

public class Solution2974 {

    public static int[] numberGame(int[] nums) {
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i+=2){
            int a = nums[i];
            int b = nums[i+1];

            nums[i] = b;
            nums[i+1] = a;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] t1 = numberGame(new int[]{5,4,2,3});
        int[] t2 = numberGame(new int[]{2,5});

        System.out.println(t1);
        System.out.println(t2);
    }

}
