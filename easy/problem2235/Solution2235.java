package easy.problem2235;

public class Solution2235 {

    public static int finalValueAfterOperations(String[] operations) {
        int r = 0;
        for(int i = 0; i < operations.length; i++){
            if(operations[i].charAt(1) == '+') r++;
            else r--;
        }

        return r;
    }

    public static void main(String[] args) {
        int t1 = finalValueAfterOperations(new String[]{"--X","X++","X++"});
        int t2 = finalValueAfterOperations(new String[]{"++X","++X","X++"});
        int t3 = finalValueAfterOperations(new String[]{"X++","++X","--X","X--"});

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }

}
