package easy.problem1672;

public class Solution1672 {
    public static int maximumWealth(int[][] accounts) {
        int max = -1;
        for(int i = 0; i < accounts.length; i++){
            int s = 0;
            for(int j = 0; j < accounts[i].length; j++){
                s += accounts[i][j];
            }
            if(s > max){
                max = s;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int t1 = maximumWealth(new int[][]{{1,2,3}, {3,2,1}});
        int t2 = maximumWealth(new int[][]{{1,5},{7,3}, {3,5}});
        int t3 = maximumWealth(new int[][]{{2,8,7},{7,1,3}, {1,9,5}});

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
