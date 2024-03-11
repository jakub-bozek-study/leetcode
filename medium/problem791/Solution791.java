package medium.problem791;

import java.util.HashMap;
import java.util.Map;

public class Solution791 {

    // My first try solution. Work well, but can be better optimized
    public static String customSortString(String order, String s) {
        char[] chars =  order.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        String result = "";

        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }


        for(char c : chars){
            if(map.get(c) != null){
                for(int i = 0; i < map.get(c); i++){
                    result += c;
                }
                map.remove(c);
            }
        }

        for (Map.Entry<Character, Integer> set : map.entrySet()) {
            for(int i = 0; i < set.getValue(); i++){
                result += set.getKey();
            }
        }

        return result;
    }


    // Better, faster solution, don't use another char array, and StringBuilder instead of just String for result append.
    // Based on YT video about that problem.
    public static String customSortStringBetter(String order, String s) {
        StringBuilder result = new StringBuilder();
        HashMap<Character, Integer> mp = new HashMap<>();
        for (char c : s.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        for (char c : order.toCharArray()) {
            if (mp.containsKey(c)) {
                result.append(String.valueOf(c).repeat(mp.get(c)));
                mp.remove(c);
            }
        }
        for (char c : mp.keySet()) {
            result.append(String.valueOf(c).repeat(mp.get(c)));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String t1 = customSortString("cba", "abcd");
        String t2 = customSortString("bcafg", "abcd");

        String t3 = customSortStringBetter("cba", "abcd");
        String t4 = customSortStringBetter("bcafg", "abcd");


        System.out.println(t1);
        System.out.println(t2);

        System.out.println("---");

        System.out.println(t3);
        System.out.println(t4);
    }
}
