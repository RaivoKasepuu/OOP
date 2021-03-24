import java.io.Serializable;
import java.util.ArrayList;

public class Auto implements Serializable  {
    private String vin;
    private String mark;
    private String model;
    private ArrayList works;

    public ArrayList getWorks() {
        return works;
    }

    public void setWorks(ArrayList works) {
        this.works = works;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "vin='" + vin + '\'' +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public Auto(String vin, String mark, String model) {
        this.vin = vin;
        this.mark = mark;
        this.model = model;

    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void addWork(String work) {

    }


}
