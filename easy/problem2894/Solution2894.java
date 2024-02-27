package easy.problem2894;

public class Solution2894 {
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
