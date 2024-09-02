package string_handle;

import java.util.ArrayList;

public class EquivalentString {

    public static void main(String[] args) {

        //exercise10
        ArrayList<String> word1 = new ArrayList<>();
        word1.add("ab");
        word1.add("c");
        ArrayList<String> word2 = new ArrayList<>();
        word2.add("a");
        word2.add("bc");
        boolean result1 = checkEquivalentString(word1, word2);
        System.out.println(result1);

        ArrayList<String> word3 = new ArrayList<>();
        word3.add("a");
        word3.add("cb");
        ArrayList<String> word4 = new ArrayList<>();
        word4.add("ab");
        word4.add("c");
        boolean result2 = checkEquivalentString(word3, word4);
        System.out.println(result2);

        ArrayList<String> word5 = new ArrayList<>();
        word5.add("abc");
        word5.add("d");
        word5.add("defg");
        ArrayList<String> word6 = new ArrayList<>();
        word6.add("abcddefg");
        boolean result3 = checkEquivalentString(word5, word6);
        System.out.println(result3);
    }

    public static boolean checkEquivalentString(ArrayList<String> word1, ArrayList<String> word2){
        String key1 = "";
        String key2 = "";
        for (String key : word1){
            key1 = key1.concat(key);
        }
        for (String key : word2){
            key2 = key2.concat(key);
        }
        return key1.equals(key2);
    }
}
