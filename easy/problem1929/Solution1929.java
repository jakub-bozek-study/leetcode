package easy.problem1929;

import java.util.Arrays;

public class Solution1929 {
    public static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];

        for(int i = 0; i < nums.length; i++){
            result[i] = nums[i];
            result[i + nums.length] = nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] t1 = getConcatenation(new int[]{1,2,1});
        int[] t2 = getConcatenation(new int[]{1,3,2,1});

        System.out.println(Arrays.toString(t1));
        System.out.println(Arrays.toString(t2));

    }
}
