package easy.problem771;

public class Solution771 {

    public static int numJewelsInStones(String jewels, String stones) {
        char[] jw = jewels.toCharArray();
        char[] st = stones.toCharArray();

        int res= 0;

        for(int i = 0; i < jw.length; i++){
            for(int j = 0; j < st.length; j++){
                if(jw[i] ==  st[j]) res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int t1 = numJewelsInStones("aA", "aAAbbbb");
        int t2 = numJewelsInStones("z", "ZZ");

        System.out.println(t1);
        System.out.println(t2);
    }
}
