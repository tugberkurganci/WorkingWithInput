public class Palindrome {

    public boolean isPalindrome(String input) {

        String[] splitted = input.split("");
        String sum1 = "";
        String sum2 = "";
        boolean palindrome = true;
        for (int i = 0; i < input.length(); i++) {
            sum1 += splitted[i];
        }
        for (int i = input.length() - 1; i > -1; i--) {
            sum2 += splitted[i];
        }
        if (sum2.equals(sum1)) {
            palindrome = true;
        } else {
            palindrome = false;
        }
        return palindrome;

    }

}