public class Palindrome {

    public boolean isPalindrome(String input) {

        String[] spilit = input.split("");
        String sum1 = "";
        String sum2 = "";
        boolean palindrome = true;
        for (int i = 0; i < input.length(); i++) {
            sum1 += spilit[i];

        }
        for (int i = input.length() - 1; i > -1; i--) {
            sum2 += spilit[i];

        }
        if (sum2.equals(sum1)) {
            palindrome = true;
        } else {
            palindrome = false;
        }

        return palindrome;

    }

}