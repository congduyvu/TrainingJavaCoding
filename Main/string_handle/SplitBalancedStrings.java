package string_handle;

public class SplitBalancedStrings {

    public static void main(String[] args) {

        //String 8
        String s1 = "RLRRLLRLRL";
        int result1 = maximumNumberBalancedString(s1);
        System.out.println(result1);

        String s2 = "RLRRRLLRLL";
        int result2 = maximumNumberBalancedString(s2);
        System.out.println(result2);

        String s3 = "LLLLRRRR";
        int result3 = maximumNumberBalancedString(s3);
        System.out.println(result3);
    }

    public static Integer maximumNumberBalancedString(String s){
        int number = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++){
            char key = s.charAt(i);
            switch (key){
                case 'L':
                    number++;
                    break;
                case 'R':
                    number--;
                    break;
            }
            if(number == 0){
                result++;
            }
        }
        return result;
    }
}
