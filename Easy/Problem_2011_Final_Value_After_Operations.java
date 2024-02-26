package Easy;

/*
 * https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/
 *
 * There is a programming language with only four operations and one variable X:
 * - ++X and X++ increments the value of the variable X by 1.
 * - --X and X-- decrements the value of the variable X by 1.
 * - Initially, the value of X is 0.
 * Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.
 *
 * */

public class Problem_2011_Final_Value_After_Operations {

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
