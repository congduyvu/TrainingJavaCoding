package string_handle;

public class ReversePrefixWord {

    public static void main(String[] args) {

        //exercise 9
        String word1 = "abcdefd";
        String ch1 = "d";
        String result1 = reversePrefixWord(word1, ch1);
        System.out.println(result1);

        String word2 = "xyxzxe";
        String ch2 = "z";
        String result2 = reversePrefixWord(word2, ch2);
        System.out.println(result2);

        String word3 = "abcd";
        String ch3 = "z";
        String result3 = reversePrefixWord(word3, ch3);
        System.out.println(result3);
    }

    public static String reversePrefixWord(String word, String ch){
        if (word.contains(ch)) {
            int index = word.indexOf(ch);
            String before = word.substring(0, index + 1);
            String after = word.substring(index + 1);
            String result = new StringBuilder(before).reverse() + after;
            return result;
        } else {
            return word;
        }
    }
}
