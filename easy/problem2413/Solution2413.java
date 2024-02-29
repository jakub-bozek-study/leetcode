package easy.problem2413;

public class Solution2413 {

    public static int smallestEvenMultiple(int n) {
        if(n % 2 != 0) return n * 2;
        return n;

        //return n % 2 != 0 ? n*2 : n;
    }

    public static void main(String[] args) {
        int t1 = smallestEvenMultiple(5);
        int t2 = smallestEvenMultiple(6);

        System.out.println(t1);
        System.out.println(t2);
    }

}
