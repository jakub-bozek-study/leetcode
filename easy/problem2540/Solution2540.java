package easy.problem2540;

import java.util.Set;
import java.util.TreeSet;

public class Solution2540 {

    // My first try solution, using set, it's not best in runtime.
    public static int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set = new TreeSet<>();

        for(int num : nums1){
            set.add(num);
        }

        for(int num : nums2){
            if(set.contains(num)) return num;
        }

        return -1;
    }

    //Better solution using 2 pointer method. based on youtube video.
    public static int getCommon2Pointer(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int n = nums1.length;
        int m = nums2.length;

        while (i < n && j < m) {
            if (nums1[i] == nums2[j])
                return nums1[i];
            else if (nums1[i] > nums2[j])
                j++;
            else
                i++;
        }

        return -1;
    }

    public static void main(String[] args) {
        int t1 = getCommon(new int[]{1,2,3}, new int[]{2,4});
        int t2 = getCommon(new int[]{1,2,3,6}, new int[]{2,3,4,5});


        System.out.println(t1);
        System.out.println(t2);
    }
}
