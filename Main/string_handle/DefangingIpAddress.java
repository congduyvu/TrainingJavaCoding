package string_handle;

public class DefangingIpAddress {

    public static void main(String[] args) {

        //Exercise 2
        String ipAddress1 = "1.1.1.1";
        String result1 = convertIpAddress(ipAddress1);
        System.out.println(result1);

        String ipAddress2 = "255.100.50.0";
        String result2 = convertIpAddress(ipAddress2);
        System.out.println(result2);
    }

    public static String convertIpAddress(String ipAddress){
        return ipAddress.replace(".", "[.]");
    }
}
