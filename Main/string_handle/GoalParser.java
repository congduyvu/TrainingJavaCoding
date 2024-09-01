package string_handle;

public class GoalParser {

    public static void main(String[] args) {

        //exercise 6
        String command1 = "G()(al)";
        String result1 = replaceKey(command1);
        System.out.println(result1);

        String command2 = "G()()()()(al)";
        String result2 = replaceKey(command2);
        System.out.println(result2);

        String command3 = "(al)G(al)()()G";
        String result3 = replaceKey(command3);
        System.out.println(result3);
    }

    public static String replaceKey(String command){
        command = command.replace("()", "o");
        command = command.replace("(al)", "al");
        return command;
    }
}
