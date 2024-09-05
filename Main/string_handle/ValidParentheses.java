package string_handle;

public class ValidParentheses {

    public static void main(String[] args) {

        //exercise 13
        String s1 = "()";
        boolean result1 = checkValidParentheses(s1);
        System.out.println(result1);

        String s2 = "()[]{}";
        boolean result2 = checkValidParentheses(s2);
        System.out.println(result2);

        String s3 = "(]";
        boolean result3 = checkValidParentheses(s3);
        System.out.println(result3);

        String s4 = "([])";
        boolean result4 = checkValidParentheses(s4);
        System.out.println(result4);
    }

    public static boolean checkValidParentheses(String s){
        if (s.isEmpty()){
            return false;
        }
        int key1 = 0;
        int key2 = 0;
        int key3 = 0;
        for (int i = 0; i < s.length(); i++){
            switch (Character.toString(s.charAt(i))) {
                case "(":
                    key1 = key1 + 1;
                    break;
                case ")":
                    key1 = key1 - 1;
                    break;
                case "{":
                    key2 = key2 + 1;
                    break;
                case "}":
                    key2 = key2 - 1;
                    break;
                case "[":
                    key3 = key3 + 1;
                    break;
                case "]":
                    key3 = key3 - 1;
                    break;
            };
        }
        return key1 == 0 && key2 == 0 && key3 == 0;
    }
}
