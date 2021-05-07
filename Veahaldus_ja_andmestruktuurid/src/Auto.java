import java.time.LocalDate;

public class Auto implements Comparable<Auto>{

    private String registreerimisnumber;
    private String omanik;
    private LocalDate ülevaatus;


    public Auto(String registreerimisnumber, String omanik, LocalDate ülevaatus) {
        this.registreerimisnumber = registreerimisnumber;
        this.omanik = omanik;
        this.ülevaatus = ülevaatus;
    }


    public String getRegistreerimisnumber() {
        return registreerimisnumber;
    }

    public String getOmanik() {
        return omanik;
    }

    public LocalDate getÜlevaatus() {
        return ülevaatus;
    }

    @Override
    public String toString() {
        return registreerimisnumber + " " + omanik + " " + ülevaatus + "\n";
    }

    public void teostaÜlevaatus() {
        if (LocalDate.now().plusYears(1).isBefore(getÜlevaatus())){
            throw new ÜlevaatuseErind("Ülevaatus on ebavajalik! Ülevaatus ei ole teostatud! Järgmine ülevaatus: 2022-06-23");
        }
        ülevaatus = LocalDate.now().plusYears(2);
        System.out.println("Ülevaatus on teostatud! Järgmine ülevaatus: " + ülevaatus);

    }

    @Override
    public int compareTo(Auto o) {
        return ülevaatus.compareTo(o.getÜlevaatus());
    }
}
