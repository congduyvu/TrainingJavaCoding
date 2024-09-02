package string_handle;

import java.util.ArrayList;

public class MaximumNumberWordsInSentences {

    public static void main(String[] args) {

        //exercise 7
        ArrayList<String> sentences1 = new ArrayList<>();
        sentences1.add("alice and bob love leetcode");
        sentences1.add("i think so too");
        sentences1.add("this is great thanks very much");
        int result1 = countNumberOfSentences(sentences1);
        System.out.println(result1);

        ArrayList<String> sentences2 = new ArrayList<>();
        sentences2.add("please wait");
        sentences2.add("continue to fight");
        sentences2.add("continue to win");
        int result2 = countNumberOfSentences(sentences2);
        System.out.println(result2);
    }

    public static Integer countNumberOfSentences(ArrayList<String> sentences){
        int result = 0;
        for(String element : sentences){
            int numberOfSentence = (element.length() - element.replace(" ", "").length()) + 1;
            if (numberOfSentence > result){
                result = numberOfSentence;
            }
        }
        return result;
    }
}
