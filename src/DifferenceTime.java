import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DifferenceTime {

    public String calculateDifference(String input) {

        Date date = new Date();
        String result = "";
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date tarih = null;
        try {
            tarih = dateFormat.parse(input);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        Long differenceYear = (date.getTime() - tarih.getTime()) / (1000L * 24 * 60 * 60 * 365);
        Long differenceDay = (date.getTime() - tarih.getTime()) / (1000 * 24 * 60 * 60);
        Long differenceHour = (date.getTime() - tarih.getTime()) / (1000 * 60 * 60);
        Long differenceMinute = (date.getTime() - tarih.getTime()) / (1000 * 60);
        Long differenceSecond = (date.getTime() - tarih.getTime()) / (1000);

        result = "Difference Year:" + differenceYear + "- Difference Day:" + differenceDay + "- Difference Hour:" + differenceHour + "- Difference minute:" + differenceMinute + "- Difference Second:" + differenceSecond;

        return result;
    }
}