package string_handle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordPattern {

    public static void main(String[] args) {

        //exercise 20
        String pattern1 = "abba";
        String s1 = "dog cat cat dog";
        List<Integer> patternList1 = customizePattern(pattern1);
        List<Integer> patternS1 = customizePattern(s1);
        boolean result1 = compareWordPattern(patternList1, patternS1);
        System.out.println(result1);

        String pattern2 = "abba";
        String s2= "dog cat cat fish";
        List<Integer> patternList2 = customizePattern(pattern2);
        List<Integer> patternS2 = customizePattern(s2);
        boolean result2 = compareWordPattern(patternList2, patternS2);
        System.out.println(result2);

        String pattern3 = "aaaa";
        String s3 = "dog cat cat dog";
        List<Integer> patternList3 = customizePattern(pattern3);
        List<Integer> patternS3 = customizePattern(s3);
        boolean result3 = compareWordPattern(patternList3, patternS3);
        System.out.println(result3);
    }

    public static List<Integer> customizePattern(String pattern){
        String[] patternOrder;
        if(pattern.contains(" ")){
            patternOrder = pattern.split("\\s+");
        }else {
            patternOrder = pattern.split("");
        }
        Map<String, Integer> elementToNumber = new HashMap<>();
        List<Integer> resultList = new ArrayList<>();
        int currentNumber = 0;
        for (String element : patternOrder) {
            if (!elementToNumber.containsKey(element)) {
                elementToNumber.put(element, currentNumber);
                currentNumber++;
            }
            resultList.add(elementToNumber.get(element));
        }
        return resultList;
    }

    public static boolean compareWordPattern(List<Integer> pattern, List<Integer> s){
        return pattern.equals(s);
    }
}
