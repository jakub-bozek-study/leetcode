package Easy;

/*
 * https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/description/
 *
 *You are given positive integers n and m.
 * Define two integers, num1 and num2, as follows:
 * - num1: The sum of all integers in the range [1, n] that are not divisible by m.
 * - num2: The sum of all integers in the range [1, n] that are divisible by m.
 * Return the integer num1 - num2.
 *
 * */

public class Problem_2894_Divisible_and_Non_Divisible_Sum_Diff {
    public static int differenceOfSums(int n, int m) {
        int a = 0;
        int b = 0;

        for(int i = 1; i <= n; i++){
            if(i%m == 0) b+=i;
            else a+=i;
        }
        return a-b;
    }

    public static void main(String[] args) {
        int t1 = differenceOfSums(10, 3);
        int t2 = differenceOfSums(5, 6);
        int t3 = differenceOfSums(5, 1);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }

}
