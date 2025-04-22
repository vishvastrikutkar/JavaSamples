package UKG.Day1;

public class PalindromeString {

    public static void main(String[] args) {
        String inputString = "madam";
        System.out.println("Is the string palindrome: " + isPalindrome(inputString));
    }
    public static boolean isPalindrome(String inputString) {
        if (inputString.isEmpty()) {
            System.out.println("String is empty.");
            return false;
        }
        int left = 0;
        int right = inputString.length() - 1;
        while (left < right) {
            if (inputString.charAt(left) != inputString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
