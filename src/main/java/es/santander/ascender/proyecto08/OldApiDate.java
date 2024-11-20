package es.santander.ascender.proyecto08;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class OldApiDate {
    public String formatDate(Date dateToFormat, String timezoneId) {
        SimpleDateFormat formatter = new SimpleDateFormat("YY/MM/dd HH:mm:ss");
        TimeZone timezone = TimeZone.getTimeZone(timezoneId);
        formatter.setTimeZone(timezone);

        return formatter.format(dateToFormat);
        

    }

}
