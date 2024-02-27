package medium.problem201check;

public class Solution2894 {
    public static int rangeBitwiseAnd(int left, int right) {

        //learn it from YT

        int cnt = 0;
        while (left != right) {
            left >>= 1;
            right >>= 1;
            cnt++;
        }
        return (left << cnt);

    }

    public static void main(String[] args) {
        int t1 = rangeBitwiseAnd(5, 7);
        int t2 = rangeBitwiseAnd(0, 0);
        int t3 = rangeBitwiseAnd(1, 2147483647);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }

}
