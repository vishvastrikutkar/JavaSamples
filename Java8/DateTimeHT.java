package Java8;

import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DateTimeHT {

    public static void main(String[] args) {

        Predicate<LocalDate> isYesterday =(date)-> date.equals(LocalDate.now().minusDays(1));
        Supplier<LocalDate> getNextThursday = ()-> LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        Supplier<LocalDateTime> getTimeInESTTimeZone = ()-> LocalDateTime.from(ZonedDateTime.now(ZoneId.of("America/New_York")));
        Function<LocalDate,Integer> getAge=(dob)-> Period.between(dob,LocalDate.now()).getYears();

        System.out.println(isYesterday.test(LocalDate.of(2024,5,24)));
        System.out.println(isYesterday.test(LocalDate.now().minusDays(1)));
        System.out.println("Next Thursday is on : "+getNextThursday.get());
        System.out.println("EST Time now is "+ getTimeInESTTimeZone.get());

        System.out.println("Age = "+getAge.apply(LocalDate.of(1983,4,24)));

    }
}
