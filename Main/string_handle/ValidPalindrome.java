package string_handle;

public class ValidPalindrome {

    public static void main(String[] args) {

        //exercise 17
        String s1 = "A man, a plan, a canal: Panama";
        boolean result1 = checkValidPalindrome(s1);
        System.out.println(result1);

        String s2 = "race a car";
        boolean result2 = checkValidPalindrome(s2);
        System.out.println(result2);

        String s3 = " ";
        boolean result3 = checkValidPalindrome(s3);
        System.out.println(result3);
    }

    public static boolean checkValidPalindrome(String s){
        String[] elements = s.split("[^a-zA-Z]+");
        StringBuffer sb = new StringBuffer();
        for (String element : elements) {
            sb.append(element);
        }
        return sb.toString().equalsIgnoreCase(sb.reverse().toString());
    }
}
