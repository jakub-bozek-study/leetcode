package easy.problem9check;

public class Solution9 {
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
