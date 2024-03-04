package easy.problem1528;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Solution1528 {

    public static String restoreString(String s, int[] indices) {

        char[] charr = s.toCharArray();

        for (int i=0; i<indices.length; i++) {
            System.out.println("/////////");
            System.out.println("indices[i]: " + indices[i]);
            charr[indices[i]] = s.charAt(i);
            System.out.println(charr);
            System.out.println("S.charAt: " + s.charAt(i));
        }
        return new String(charr);


        // Working, but slow solutions

        // Map<Integer, Character> map = new HashMap();
        // int size = indices.length;
        // String res = "";

        // for(int i = 0; i < size; i++){
        //     map.put(indices[i], s.charAt(i));
        // }

        // for(int i = 0; i < size; i++){
        //     res+=map.get(i);
        // }
        ///////////////////

        // String res = "";
        // int count = 0;

        // while(count < indices.length){
        //     for(int i = 0; i < indices.length; i++){
        //         if(count == indices[i]) res += s.charAt(i);
        //     }

        //     count++;
        // }

        //return res;

        ///////////////////////


    }

    public static void main(String[] args) {
        String t1 = restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3});
        String t2 = restoreString("abc", new int[]{0,1,2});

        System.out.println(t1);
        System.out.println(t2);
    }
}
