package string_handle;

public class TruncatedSentence {

    public static void main(String[] args) {

        //exercise 11
        String s1 = "Hello how are you Contestant";
        int k1 = 4;
        String result1 = truncateSentence(s1, k1);
        System.out.println(result1);

        String s2 = "What is the solution to this problem";
        int k2 = 4;
        String result2 = truncateSentence(s2, k2);
        System.out.println(result2);

        String s3 = "chopper is not a tanuki";
        int k3 = 5;
        String result3 = truncateSentence(s3, k3);
        System.out.println(result3);
    }

    public static String truncateSentence(String s, int k){
        String result = "";
        String[] list = s.split(" ");
        for (int i = 0; i < k; i++){
            result = result.concat(list[i]).concat(" ");
        }
        return result.trim();
    }
}
