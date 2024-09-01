package string_handle;

public class JewelsStones {

    public static void main(String[] args) {

        //Exercise 4
        String jewels1 = "aA";
        String stones1 = "aAAbbbb";
        int result1 = countJewelsInStones(jewels1, stones1);
        System.out.println(result1);

        String jewels2 = "z";
        String stones2 = "ZZ";
        int result2 = countJewelsInStones(jewels2, stones2);
        System.out.println(result2);
    }

    public static Integer countJewelsInStones(String jewels, String stones){
        int result = 0;
        for (int i = 0; i < jewels.length(); i++){
            char key = jewels.charAt(i);
            for (int j = 0; j < stones.length(); j++){
                char elementInStone = stones.charAt(j);
                if(String.valueOf(key).equals(String.valueOf(elementInStone))){
                    result++;
                }
            }
        }
        return result;
    }
}
