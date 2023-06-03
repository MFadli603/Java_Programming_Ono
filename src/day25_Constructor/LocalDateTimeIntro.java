package day25_Constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeIntro {

    public static void main(String[] args) {

        LocalDateTime starts = LocalDateTime.now();
        System.out.println(starts);

        LocalDateTime ends = LocalDateTime.of(2023, 4, 6, 11, 30);
        System.out.println(ends);

        System.out.println(starts.getDayOfWeek());

    }
}
