package easy.problem231;

public class Solution231 {

    public static boolean isPowerOfTwo(int n) {
        if(n == 0) return false;

        while(n%2 == 0){
            n /= 2;
        }

        if(n == 1) return true;
        return false;
    }

    public static void main(String[] args) {
        boolean t1 = isPowerOfTwo(1);
        boolean t2 = isPowerOfTwo(16);
        boolean t3 = isPowerOfTwo(3);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }

}
