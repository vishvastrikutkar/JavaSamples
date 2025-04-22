package Java8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeAPI {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getYear());

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(localDateTime.format(dateTimeFormatter));

        dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(localTime.format(dateTimeFormatter));

        ZoneId zoneId = ZoneId.of("America/New_York");
        System.out.println(zoneId);

        LocalDate localDate1 = LocalDate.of(1983,4,24);
        System.out.println(localDate1);
        System.out.println(localDate);

        System.out.println("My age "+ Period.between(localDate1,localDate).getYears());
        System.out.println("My days of earth "+ ChronoUnit.DAYS.between(localDate1,localDate));
    }
}
