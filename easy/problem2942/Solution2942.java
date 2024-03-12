package easy.problem2942;

import java.util.ArrayList;
import java.util.List;

public class Solution2942 {

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> index = new ArrayList<>();

        for(int i = 0; i < words.length; i++){
            if(words[i].indexOf(x) >= 0) index.add(i);
        }

        return index;
    }

    public static void main(String[] args) {
        List<Integer> t1 = findWordsContaining(new String[]{"leet","code"}, 'e');
        List<Integer> t2 = findWordsContaining(new String[]{"abc","bcd","aaaa","cbc"}, 'a');
        List<Integer> t3 = findWordsContaining(new String[]{"abc","bcd","aaaa","cbc"}, 'z');

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }

}
