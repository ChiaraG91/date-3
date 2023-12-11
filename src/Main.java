import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        dateInfo();
    }

    public static void dateInfo() {

        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(data);

        String dataStringYear = data.format(DateTimeFormatter.ofPattern("yyyy"));
        System.out.println("dataStringYear: " + dataStringYear);

        String dataStringMonth = data.format(DateTimeFormatter.ofPattern("MMMM"));
        System.out.println("dataStringMonth: " + dataStringMonth);

        String dataStringDay = data.format(DateTimeFormatter.ofPattern("dd"));
        System.out.println("dataStringDay: " + dataStringDay);

        String dataStringDayWeek = data.format(DateTimeFormatter.ofPattern("E"));
        System.out.println("dataStringDayWeek: " + dataStringDayWeek);
    }
}
