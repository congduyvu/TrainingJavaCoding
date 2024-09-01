package string_handle;

import java.util.ArrayList;

public class ContainingCharacter {

    public static void main(String[] args) {

        //exercise 5
        ArrayList<String> words1 = new ArrayList<>();
        words1.add("leet");
        words1.add("code");
        String x1 = "e";
        String result1 = findCharacterInWords(words1, x1);
        System.out.println(result1);

        ArrayList<String> words2 = new ArrayList<>();
        words2.add("abc");
        words2.add("bcd");
        words2.add("aaaa");
        words2.add("cbc");
        String x2 = "a";
        String result2 = findCharacterInWords(words2, x2);
        System.out.println(result2);

        ArrayList<String> words3 = new ArrayList<>();
        words3.add("abc");
        words3.add("bcd");
        words3.add("aaaa");
        words3.add("cbc");
        String x3 = "z";
        String result3 = findCharacterInWords(words3, x3);
        System.out.println(result3);
    }

    public static String findCharacterInWords(ArrayList<String> words, String x){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < words.size(); i++){
            String element = words.get(i);
            if(element.contains(x)){
                result.add(i);
            }
        }
        if (result.isEmpty()) {
            return "[]";
        } else if (result.size() == 1) {
            return "[" + result.get(0) + "]";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < result.size(); i++) {
                sb.append(result.get(i));
                if (i < result.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
