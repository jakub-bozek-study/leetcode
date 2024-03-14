package easy.problem2652;

public class Solution2652 {

    public static int sumOfMultiples(int n) {
        int sum = 0;

        for(int i = 1; i <= n; i++){
            if(i % 3 == 0) sum += i;
            else if(i % 5 == 0) sum += i;
            else if(i % 7 == 0) sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int t1 = sumOfMultiples(7);
        int t2 = sumOfMultiples(10);
        int t3 = sumOfMultiples(9);


        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
