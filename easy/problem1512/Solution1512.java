package easy.problem1512;

public class Solution1512 {

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
