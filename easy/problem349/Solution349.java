package easy.problem349;



import java.util.*;

public class Solution349 {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> resultList = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num)) {
                resultList.add(num);
                map.remove(num);
            }
        }

        int[] res = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            res[i] = resultList.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] t1 = intersection(new int[]{1,2,2,1}, new int[]{2,2});
        int[] t2 = intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4});


        System.out.println(Arrays.toString(t1));
        System.out.println(Arrays.toString(t2));

    }
}
