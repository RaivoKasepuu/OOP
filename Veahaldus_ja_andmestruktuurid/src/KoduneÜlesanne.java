import java.time.LocalDate;

public class KoduneÜlesanne {
    private LocalDate deadLine;

    public KoduneÜlesanne(LocalDate deadLine) {
        String weekDay = deadLine.getDayOfWeek().toString();
        String[] dateDetail = deadLine.toString().split("-");
        if (weekDay.equals("SUNDAY") || weekDay.equals("SATURDAY")) {
            throw new IllegalArgumentException("Sisestasite: " + dateDetail[2] + "." + dateDetail[1] + "." + dateDetail[0] + ", tegemist on nädalavahetusega ja see polnud lubatud!");
        }
        this.deadLine = deadLine;
    }

    public LocalDate getTähtaeg() {
        return deadLine;
    }

    public void setTähtaeg(LocalDate deadLine) {
        String weekDay = deadLine.getDayOfWeek().toString();
        String[] dateDetail = deadLine.toString().split("-");
        if (weekDay.equals("SUNDAY") || weekDay.equals("SATURDAY")) {
            throw new IllegalArgumentException("Sisestasite: " + dateDetail[2] + "." + dateDetail[1] + "." + dateDetail[0] + ", tegemist on nädalavahetusega ja see polnud lubatud!");
        }
        this.deadLine = deadLine;
    }
}