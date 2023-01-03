import java.util.ArrayList;

public class Polidrom {

    public boolean isPolidrom(String input) {

        String[] spilit = input.split("");
        String sum1 = "";
        String sum2 = "";
        boolean polidrom = true;
        for (int i = 0; i < input.length(); i++) {
            sum1 += spilit[i];


        }
        for (int i = input.length() - 1; i > -1; i--) {
            sum2 += spilit[i];

        }
        if (sum2.equals(sum1)) {
            polidrom = true;
        } else {
            polidrom = false;
        }

        return polidrom;


    }

}
