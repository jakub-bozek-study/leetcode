package easy.problem118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution118 {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> first = new ArrayList<>();

        first.add(1);
        res.add(first);

        for(int i = 1; i < numRows; i++){
            List<Integer> prevRow = res.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);

            for(int j = 1; j < i; j++){
                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            currentRow.add(1);
            res.add(currentRow);
        }
        return res;
    }

    public static void main(String[] args) {
        List<List<Integer>> t1 = generate(5);
        List<List<Integer>> t2 = generate(1);

        System.out.println(t1);
        System.out.println(t2);
    }
}
