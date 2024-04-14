package easy.problem2103;

public class Solution2103 {

    public static int countPoints(String rings) {
        if(rings.length() <= 4) return 0;

        int[] r = new int[10];
        int[] g = new int[10];
        int[] b = new int[10];

        while(rings.length() != 0){
            char color = rings.charAt(0);
            int rod = Character.getNumericValue(rings.charAt(1));
            rings = rings.substring(2);

            if(color == 'R') r[rod] = 1;
            if(color == 'G') g[rod] = 1;
            if(color == 'B') b[rod] = 1;
        }

        int result = 0;

        for(int i = 0; i < 10; i++){
            if(r[i] + g[i] + b[i] == 3) result++;
        }

        return result;

    }

    public static void main(String[] args) {
        int t1 = countPoints("B0B6G0R6R0R6G9");
        int t2 = countPoints("B0R0G0R9R0B0G0");
        int t3 = countPoints("G4");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }

}
