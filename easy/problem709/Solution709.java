package easy.problem709;

public class Solution709 {

    /// Solution w/o using build in .toLowerCase() method.
    public static String toLowerCase(String s) {
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
                res.append(Character.toString(s.charAt(i) + 32));
            } else {
                res.append(s.charAt(i));
            }

        }

        return res.toString();
    }

    public static void main(String[] args) {
        String t1 = toLowerCase("Hello");
        String t2 = toLowerCase("here");
        String t3 = toLowerCase("LOVELY");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
