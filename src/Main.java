import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Main {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        TemporalAdjuster nextTuesday = TemporalAdjusters.next(DayOfWeek.TUESDAY);{
            System.out.println(today.with(nextTuesday));
        }
    }
}
