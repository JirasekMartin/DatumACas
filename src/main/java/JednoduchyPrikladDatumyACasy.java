import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class JednoduchyPrikladDatumyACasy {
    public static void main(String[] args) {
        System.out.println("Vypisuji součty cifer v datu pro následujících 7 dní");
        DateTimeFormatter formatData = DateTimeFormatter.ofPattern("d.M.yyyy");
        // Aktuální datum
        LocalDate datum = LocalDate.now();
        // Cyklus pro 7 dní
        for (int i = 0; i < 7; i++) {
            // Součet cifer
            int den = datum.getDayOfMonth();
            int mesic = datum.getMonthValue();
            int rok = datum.getYear();
            int soucet = den + mesic + rok;
            System.out.printf("%s - %d%n", formatData.format(datum), soucet);
            // Posunutí data o den dopředu
            datum = datum.plusDays(1);
        }
    }
}
