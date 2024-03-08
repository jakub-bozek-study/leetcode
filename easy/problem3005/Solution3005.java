package easy.problem3005;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution3005 {
    // My first time solution for problem using stream - rly bad runtime for such easy problem
    public static int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
        }

        int c = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getValue();

        return map.values().stream().mapToInt(d -> {
            if(d == c) return d;
            else return 0;
        }).sum();
    }

    // Solution with better runtime, just use 2 for loop
    public int maxFrequencyElementsFaster(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int val : nums) {
            map.put(val, map.getOrDefault(val, 0)+1);
        }

        int count = 0;
        int max = -1;
        for(int freq : map.values()) {
            max = Math.max(max, freq);
        }

        for(int freq : map.values()) {
            if(freq==max) {
                count += max;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(maxFrequencyElements(new int[]{1,2,2,3,1,4}));
        System.out.println(maxFrequencyElements(new int[]{1,2,3,4,5}));
    }

}
