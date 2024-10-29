import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocaleDateConversion {
    public static void main(String[] args) {
        Locale usLocale = new Locale("en", "US");
        Locale franceLocale = new Locale("fr", "FR");
        Locale japanLocale = new Locale("jp", "JP");

        // TODO: Obtain the current date using LocalDate.now()
        LocalDate now = LocalDate.now();


    }



    private static void printFormattedDate(Locale locale, LocalDate date) {
        DateTimeFormatter USFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy, HH:mm", Locale.US);
        String formattedDateUS = now.format(USFormatter);

        System.out.println("Formatted Date (US): " + formattedDateUS);

        DateTimeFormatter FRFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy, HH:mm", Locale.FRANCE);
        String formattedDateFR = now.format(FRFormatter);

        System.out.println("Formatted Date (France): " + formattedDateFR);

        DateTimeFormatter JPFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy, HH:mm", Locale.JAPAN);
        String formattedDateJP = now.format(JPFormatter);

        System.out.println("Formatted Date (Japan): " + formattedDateJP);
    }
}

}
