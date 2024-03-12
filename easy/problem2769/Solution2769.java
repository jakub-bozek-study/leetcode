package easy.problem2769;

public class Solution2769 {

    // Troll question, confusing description, but problem is just return simple math.
    public static int theMaximumAchievableX(int num, int t) {
        return num + 2*t;
    }

    public static void main(String[] args) {
        int t1 = theMaximumAchievableX(4, 1);
        int t2 = theMaximumAchievableX(3, 2);

        System.out.println(t1);
        System.out.println(t2);
    }
}
