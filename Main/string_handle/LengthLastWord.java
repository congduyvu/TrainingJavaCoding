package string_handle;

public class LengthLastWord {

    public static void main(String[] args) {

        //exercise 15
        String s1 = "Hello World";
        int result1 = lengthOfLastWord(s1);
        System.out.println(result1);

        String s2 = "   fly me   to   the moon  ";
        int result2 = lengthOfLastWord(s2);
        System.out.println(result2);

        String s3 = "luffy is still joyboy";
        int result3 = lengthOfLastWord(s3);
        System.out.println(result3);
    }

    public static Integer lengthOfLastWord(String s){
        String[] elements = s.split("\\s+");
        return elements[elements.length - 1].length();
    }
}
