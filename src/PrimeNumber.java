import java.util.ArrayList;

public class PrimeNumber {
    public ArrayList<Integer> isPrime(int input) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        boolean prime = true;
        for (int i = 2; i < input; i++) {
            for (int j = 2; j < i; j++) {
                if (!(i % j == 0)) {
                    prime = true;


                } else {
                    prime = false;

                    if (prime == false) break;
                }


            }
            if (prime) numbers.add(i);
        }

        return numbers;
    }
}
