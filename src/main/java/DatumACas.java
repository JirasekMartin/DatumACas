
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DatumACas {
    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG, FormatStyle.SHORT)));
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d.M.y H:m:ss")));
    }
}
