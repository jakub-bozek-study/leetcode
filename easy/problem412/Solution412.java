package easy.problem412;



import java.util.ArrayList;
import java.util.List;

public class Solution412 {

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            if(i%3 == 0 && i%5 == 0) result.add("FizzBuzz");
            else if(i%3 == 0) result.add("Fizz");
            else if(i%5 == 0) result.add("Buzz");
            else result.add("" + i);
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> t1 = fizzBuzz(14);
        List<String> t2 = fizzBuzz(8);
        List<String> t3 = fizzBuzz(123);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
