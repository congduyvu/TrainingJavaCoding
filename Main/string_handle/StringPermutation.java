package string_handle;

public class StringPermutation {

    public static void main(String[] args) {

        //Exercise 3
        String s1 = "abc";
        String t1 = "bac";
        int result1 = absoluteCalculation(s1, t1);
        System.out.println("Result 1: "+ result1);

        String s2 = "abcde";
        String t2 = "edbac";
        int result2 = absoluteCalculation(s2, t2);
        System.out.println("Result 2: "+ result2);
    }

    public static Integer absoluteCalculation(String s, String t){
        int result = 0;
        for (int i = 0; i < s.length(); i++){
            int index = t.indexOf(Character.toString(s.charAt(i)));
            result = result + Math.abs(i - index);
        }
        return result;
    }
}
