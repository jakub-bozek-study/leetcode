package Easy;

/*
 * https://leetcode.com/problems/palindrome-number/description/
 *
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 *
 * */

public class Problem_9_Palindrome_Number {
    public static boolean isPalindrome(int x) {
        int original = x;
        int rev = 0;
        while(x>0){
            rev = x%10 + rev*10;
            x= x/10;
        }
        return rev == original;
    }

    public static void main(String[] args) {
        boolean t1 = isPalindrome(121);
        boolean t2 = isPalindrome(-121);
        boolean t3 = isPalindrome(10);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }

}
