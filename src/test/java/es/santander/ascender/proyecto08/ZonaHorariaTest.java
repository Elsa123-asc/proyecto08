package es.santander.ascender.proyecto08;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import java.util.Date;
import java.util.Calendar;

public class ZonaHorariaTest {
    @Test
    public void formatDateWithKyivTimezone() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2024, Calendar.NOVEMBER, 20, 0, 45, 1);
        Date date = calendar.getTime();
        String timezone = "Europe/Kiev";
        String formattedDate = new OldApiDate().formatDate(date, timezone);
        assertEquals("24/11/20 01:45:01", formattedDate);
    }

    @Test
    public void formatDateWithTokioTimezone() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2024, Calendar.NOVEMBER, 20, 0, 45, 1);
        Date date = calendar.getTime();
        String timezone = "Asia/Tokyo";
        String formattedDate = new OldApiDate().formatDate(date, timezone);
        assertEquals("24/11/20 08:45:01", formattedDate);
    }

}
