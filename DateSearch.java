import java.time.*;
import static java.time.DayOfWeek.*;
import static java.time.temporal.TemporalAdjusters.*;


public class DateSearch {
    public static void main(String[] args){
        LocalDate date = LocalDate.of(2023,1,1);
        System.out.println(date.with(dayOfWeekInMonth(4, TUESDAY)));
    }
}
