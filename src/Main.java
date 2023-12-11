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

        String dataStringYear2 = String.valueOf(data.getYear());
        System.out.println("dataStringYear2: " + dataStringYear2);

        String dataStringMonth = data.format(DateTimeFormatter.ofPattern("MMMM"));
        System.out.println("dataStringMonth: " + dataStringMonth);

        String dataStringMonth2 = String.valueOf(data.getMonth());
        System.out.println("dataStringMonth2: " + dataStringMonth2);

        String dataStringDay = data.format(DateTimeFormatter.ofPattern("dd"));
        System.out.println("dataStringDay: " + dataStringDay);

        String dataStringDay2 = String.valueOf(data.getDayOfMonth());
        System.out.println("dataStringDay2: " + dataStringDay2);

        String dataStringDayWeek = data.format(DateTimeFormatter.ofPattern("E"));
        System.out.println("dataStringDayWeek: " + dataStringDayWeek);

        String dataStringDayWeek2 = String.valueOf(data.getDayOfWeek());
        System.out.println("dataStringDayWeek2: " + dataStringDayWeek2);
    }
}
