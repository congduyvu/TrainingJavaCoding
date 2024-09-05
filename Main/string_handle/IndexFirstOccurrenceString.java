package string_handle;

public class IndexFirstOccurrenceString {

    public static void main(String[] args) {

        //exercise14
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        int result1 = findIndex(haystack1, needle1);
        System.out.println(result1);

        String haystack2 = "leetcode";
        String needle2 = "leeto";
        int result2 = findIndex(haystack2, needle2);
        System.out.println(result2);
    }

    public static Integer findIndex(String haystack, String needle){
        return haystack.indexOf(needle);
    }
}
