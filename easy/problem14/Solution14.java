package easy.problem14;

import java.util.Arrays;

public class Solution14 {

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String answer = "";
        String a = strs[0];
        String b = strs[strs.length - 1];

        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == b.charAt(i)) answer += a.charAt(i);
            else return answer;
        }

        return answer;
    }

    public static void main(String[] args) {
        String t1 = longestCommonPrefix(new String[]{"flower","flow","flight"});
        String t2 = longestCommonPrefix(new String[]{"dog","racecar","car"});
        String t3 = longestCommonPrefix(new String[]{"ab", "a"});


        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
