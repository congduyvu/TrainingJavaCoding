package string_handle;

public class StringScore {

    public static void main(String[] args) {

        String givenString1 = "hello";
        int result1 = AbsoluteCalculation(givenString1);
        System.out.println(result1);

        String givenString2 = "zaz";
        int result2 = AbsoluteCalculation(givenString2);
        System.out.println(result2);
    }

    public static Integer AbsoluteCalculation(String givenString){
        int temp = 0;
        int result = 0;
        for (int i = 0;i < givenString.length(); i++){
            char n = givenString.charAt(i);
            if(i >= 1){
                result = result + Math.abs(temp - (int) n);
            }
            temp = (int) n;
        }
        return result;
    }
}
