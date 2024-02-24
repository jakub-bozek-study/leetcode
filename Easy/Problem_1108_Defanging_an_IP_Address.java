package Easy;

public class Problem_1108_Defanging_an_IP_Address {

    public static String defangIPaddr(String address) {
        address = address.replace(".","[.]");
        return address;
    }

    public static void main(String[] args) {
        String t1 = defangIPaddr("1.1.1.1");
        String t2 = defangIPaddr("255.100.50.0");


        System.out.println(t1);
        System.out.println(t2);
    }
}
