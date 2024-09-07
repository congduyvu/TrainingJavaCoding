package string_handle;

import java.util.HashMap;

public class ExcelSheetColumnTitle {

    public static void main(String[] args) {

        //exercise 18
        int columnNumber1 = 1;
        String result1 = getValueFromExcelSheet(columnNumber1);
        System.out.println(result1);

        int columnNumber2 = 28;
        String result2 = getValueFromExcelSheet(columnNumber2);
        System.out.println(result2);

        int columnNumber3 = 701;
        String result3 = getValueFromExcelSheet(columnNumber3);
        System.out.println(result3);
    }

    public static String getValueFromExcelSheet(int value){
        HashMap<Integer, String> hashMap = new HashMap<>();
        char c = 'A';
        int numberOfCharacter = 27;
        for (int i = 1; i < numberOfCharacter; i++){
            hashMap.put(i, Character.toString(c));
            c++;
        }
        String result = "";
        HashMap<Integer, String> hashMap2 = new HashMap<>();
        for(int key : hashMap.keySet()){
            for(int keyValue : hashMap.keySet()){
                result = hashMap.get(key).concat(hashMap.get(keyValue));
                hashMap2.put(numberOfCharacter, result);
                numberOfCharacter++;
            }
        }
        hashMap.putAll(hashMap2);
        return hashMap.get(value);
    }
}
