package es.santander.ascender.proyecto08;

import java.util.Date;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String timezone = "Europe/Kiev";
        Date date = new Date();
        String formattedDate = new OldApiDate().formatDate(date, timezone);
        System.out.println(date);
        System.out.println(formattedDate);
    }
}
