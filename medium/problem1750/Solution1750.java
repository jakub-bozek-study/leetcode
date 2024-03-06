package medium.problem1750;

public class Solution1750 {


    // Idea for this solution is from YT.
    public static int minimumLength(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right && s.charAt(left) == s.charAt(right)) {
            char ch = s.charAt(left);
            while (left <= right && s.charAt(left) == ch) left++;
            while (left <= right && s.charAt(right) == ch) right--;
        }
        return right - left + 1;
    }




    // Working solution on my first try. I thought too much about this solution and so this little monster was created.
    public static int minimumLengthWRONG(String s) {
        while (true) {
            int size = s.length();
            if (size == 1) return 1;

            String left = size % 2 == 0 ? s.substring(0, (size / 2)) : s.substring(0, (size / 2) + 1);
            String right = size % 2 != 0 ? s.substring((size / 2) + 1, size) : s.substring((size / 2), size);
            right = reverse(right);




            if(left.length() == 0) return 0;

            if (left.charAt(0) == right.charAt(0)) {
                char x = left.charAt(0);

                while(left.length() > 0){
                    if (left.charAt(0) == x) {
                        left = left.substring(1);

                    }  else break;
                }

                while(right.length() > 0){
                    if (right.charAt(0) == x) {
                        right = right.substring(1);
                    } else break;
                }

                while(left.length() > 0 || right.length() > 0){
                    if(left.length() == 0 && right.charAt(right.length() - 1) == x){
                        right = right.substring(0,right.length() - 1);
                    } else if(right.length() == 0 && left.charAt(left.length() - 1) == x){
                        left = left.substring(0,left.length() - 1);
                    } else break;
                }


                s = left + reverse(right);

            } else {
                return left.length() + right.length();
            }
        }
    }

    public static String reverse(String word) {
        String reverse = "";
        char ch;

        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            reverse = ch + reverse;
        }

        return reverse;
    }


    public static void main(String[] args) {
        System.out.println(minimumLength("ccccccccccccccccccccccccccccccccccccccabacabbcbcacaacaaacaaaabccaaabaabbabcbaababaabbaaaaababbbcacbacabacababacaacccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc"));
        System.out.println(minimumLengthWRONG("ccccccccccccccccccccccccccccccccccccccabacabbcbcacaacaaacaaaabccaaabaabbabcbaababaabbaaaaababbbcacbacabacababacaacccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc"));
    }

}
