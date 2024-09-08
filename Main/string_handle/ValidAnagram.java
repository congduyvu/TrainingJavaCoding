package string_handle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ValidAnagram {

    public static void main(String[] args) {

        //exercise 19
        String s1 = "anagram";
        String t1 = "nagaram";
        boolean result1 = checkValidAnagram(s1, t1);
        System.out.println(result1);

        String s2 = "rat";
        String t2 = "car";
        boolean result2 = checkValidAnagram(s2, t2);
        System.out.println(result2);
    }

    public static ArrayList<String> splitCharacterIntoArray(String str){
        ArrayList<String> arrayList = new ArrayList<>();
        for (char c : str.toCharArray()){
            arrayList.add(String.valueOf(c));
        }
        return arrayList;
    }

    public static boolean checkValidAnagram(String s, String t){
        List<String> arrayListS = splitCharacterIntoArray(s);
        List<String> arrayListT = splitCharacterIntoArray(t);

        Iterator<String> stringIteratorS = arrayListS.iterator();

        while (stringIteratorS.hasNext()){
            String key = stringIteratorS.next();
            for (String value : arrayListT){
                if(key.equals(value)){
                    stringIteratorS.remove();
                    break;
                }
            }
        }
        return arrayListS.isEmpty();
    }
}
