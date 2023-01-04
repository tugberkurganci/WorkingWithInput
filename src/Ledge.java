import java.util.Scanner;

public class Ledge {

    DifferenceTime differenceTime = new DifferenceTime();
    RoundOperation roundOperation = new RoundOperation();
    Palindrome palindrome = new Palindrome();
    PrimeNumber primeNumber = new PrimeNumber();
    Scanner scanner = new Scanner(System.in);

    public void starter() {

        System.out.println("if date data is to be entered format : day/month/year hour:minute:second");
        String input = scanner.nextLine();

        if (input.contains("/") && input.contains(":")) {

            System.out.println(differenceTime.calculateDifference(input));
        } else if (input.contains(".")) {
            System.out.println(roundOperation.aDoubleToRound(input));
        } else if (input.contains("F")&&input.chars().anyMatch(Character::isDigit)) {
            System.out.println(roundOperation.aFloatToRound(input));
        } else if (input.chars().allMatch(Character::isAlphabetic)) {
            System.out.println(palindrome.isPalindrome(input));
        } else {
            System.out.println(primeNumber.isPrime(Integer.parseInt(input)));

        }
    }
}
