package easy.problem997check;

public class Solution997 {

    public static int findJudge(int n, int[][] trust) {
        int[] in = new int[n + 1];
        int[] out = new int[n + 1];
        for (int[] a : trust) {
            out[a[0]]++;
            in[a[1]]++;
        }
        for (int i = 1; i <= n; ++i) {
            if (in[i] == n - 1 && out[i] == 0)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int t1 = findJudge(2, new int[][]{{1,2}});
        int t2 = findJudge(3, new int[][]{{1,3}, {2,3}});
        int t3 = findJudge(3, new int[][]{{1,3}, {2,3}, {3,1}});

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
