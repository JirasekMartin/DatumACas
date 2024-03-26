import java.time.LocalDate;
import java.time.temporal.ChronoUnit;



public class DatumyACasy {

    public static void main(String[] args) {

        LocalDate halloween = LocalDate.of(2016, 10, 31);
        LocalDate vanoce = LocalDate.of(2016, 12, 25);
        System.out.println("Halloween po Vánocích: " + halloween.isAfter(vanoce));
        System.out.println("Halloween před Vánocemi: " + halloween.isBefore(vanoce));
        System.out.println("shodný Vánoce - Halloween: " + vanoce.isEqual(halloween));
        System.out.println("shodný Halloween - Halloween: " + halloween.isEqual(halloween));
        System.out.println("přestupný rok 2016: " + halloween.isLeapYear());
        System.out.println("přestupný rok 2017: " + halloween.withYear(2017).isLeapYear());
        System.out.println("podporuje hodiny: " + halloween.isSupported(ChronoUnit.HOURS));
        System.out.println("podporuje roky: " + halloween.isSupported(ChronoUnit.YEARS));
    }
}
