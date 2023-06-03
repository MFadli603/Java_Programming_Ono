package day25_Constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {

    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("y-MMM-d");

        LocalDate today = LocalDate.now();

        System.out.println(today.format(df));

        DateTimeFormatter tf  = DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime time1 = LocalTime.of(17, 30);

        System.out.println( time1.format(tf) ); //07:05

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MMM/dd/y  hh:mm a");

        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts.format(dtf));


    }
}
