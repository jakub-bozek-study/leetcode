package Easy;

public class Problem_2469_Convert_the_Temperature {

    public static double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15, celsius * 1.80 + 32.00};
    }

    public static void main(String[] args) {
        double[] t1 = convertTemperature(36.50);
        double[] t2 = convertTemperature(122.11);


        System.out.println("["+t1[0]+","+t1[1]+"]");
        System.out.println("["+t2[0]+","+t2[1]+"]");
    }
}
