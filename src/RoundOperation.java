public class RoundOperation {

    public int aDoubleToRound(String input) {

        String [] b=input.split("\\.");

        String criteria="5";
        int number1=Integer.parseInt(b[1]);
        int number2=Integer.parseInt(b[0]);
        for (int i = 0; i <b[1].length()-1 ; i++) {

            criteria+="0";
        }
        int newCriteria=Integer.parseInt(criteria);
        if (number1>(newCriteria)){number2=number2+1;}else {

            number2=number2;
        }
        return number2;
    }
    public String aFloatToRound(String input) {

        String result=input.substring(0,input.length()-1);
        return result;
    }
}
