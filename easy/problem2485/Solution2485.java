package easy.problem2485;

public class Solution2485 {

    // My solution
    public static int pivotInteger(int n) {
        int sum = 0;
        int temp = 0;

        for(int i = 1; i <= n; i++){
            sum += i;
        }

        for(int i = 1; i <= n; i++){
            sum -= i;
            if(temp == sum) return i;
            temp += i;
        }

        return -1;
    }

    // Pure math solution from forum
    // https://leetcode.com/problems/find-the-pivot-integer/solutions/4866663/maths-is-everywhere-you-can-t-escape-it-ap-maths-explained/
    public int pivotIntegerMath(int n) {
        int sum = n*(n+1)/2;
        double a = Math.sqrt(sum);

        if( a - Math.ceil(a)==0) return (int) a;
        else return -1;
    }

    public static void main(String[] args) {
        int t1 = pivotInteger(8);
        int t2 = pivotInteger(1);
        int t3 = pivotInteger(4);


        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
