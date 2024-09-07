package string_handle;

public class BinaryAddition {

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1; // Pointer for string a
        int j = b.length() - 1; // Pointer for string b
        int carry = 0; // Initialize carry
        // Loop through both strings from the end to the beginning
        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry; // Start with carry
            // Add bit from string a if available
            if (i >= 0) {
                sum += a.charAt(i--) - '0'; // Convert char to int

            }
            // Add bit from string b if available
            if (j >= 0) {
                sum += b.charAt(j--) - '0'; // Convert char to int
            }
            // Append the result (sum % 2) to the result (0 or 1)
            result.append(sum % 2);
            // Update carry
            carry = sum / 2;
        }
        // Since we appended the result in reverse order, reverse the result before returning
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1101";
        System.out.println("Sum: " + addBinary(a, b)); // Output: 10111
    }
}
