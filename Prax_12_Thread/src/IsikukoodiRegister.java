import java.util.LinkedList;
import java.util.List;

/*
Kirjutada klass IsikukoodiRegister. Klassis on List<String>, mis hoiab isikukoode ja meetod registreeri,
mis lisab etteantud isikukoodi listi, kui seda seal veel ei ole. Lisaks on meetod järjekorranumber,
mis tagastab etteantud isikukoodi indeksi registri listis või -1, kui isikukood ei ole registreeritud.
Kasutada sünkroniseerimist, nii et registri list on võidujooksude eest kaitstud. Kasutada listi isendit monitorina.
 */

public class IsikukoodiRegister {

    private List<String> isikukoodiList = new LinkedList<>();

    public void registreeri(String isikukood) {
        synchronized (this) {
            if (!isikukoodiList.contains(isikukood)) {
                isikukoodiList.add(isikukood);
            }
        }
    }

    public synchronized int järjekorranumber(String isikukood) {
        synchronized (this) {
            if (isikukoodiList.contains(isikukood)) {
                return isikukoodiList.indexOf(isikukood);
            } else {
                return -1;
            }
        }
    }
}
