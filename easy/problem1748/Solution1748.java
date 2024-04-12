package easy.problem1748;

import java.util.HashMap;
import java.util.Map;

public class Solution1748 {
    public static int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            if(!map.containsKey(num)) map.put(num, 1);
            else map.put(num, -1);
        }

        int sum = 0;

        for(int num : nums){
            if(map.get(num) != -1) sum += num;
        }

        return sum;

    }

    public static void main(String[] args) {
        int t1 = sumOfUnique(new int[]{1,2,3,2});
        int t2 = sumOfUnique(new int[]{1,1,1,1,1});
        int t3 = sumOfUnique(new int[]{1,2,3,4,5});

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
