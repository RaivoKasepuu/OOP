import java.util.Date;

public class Töö {

    private int autoId;
    private String tööNimetus;
    private String tööLisaInfo;
    private Date tööTähtaeg;
    private boolean tööTehtud;

    public Töö(int autoId, String tööNimetus, String tööLisaInfo, Date tööTähtaeg, boolean tööTehtud) {
        this.autoId = autoId;
        this.tööNimetus = tööNimetus;
        this.tööLisaInfo = tööLisaInfo;
        this.tööTähtaeg = tööTähtaeg;
        this.tööTehtud = tööTehtud;
    }

    public int getAutoId() {
        return autoId;
    }

    public void setAutoId(int autoId) {
        this.autoId = autoId;
    }

    public String getTööNimetus() {
        return tööNimetus;
    }

    public void setTööNimetus(String tööNimetus) {
        this.tööNimetus = tööNimetus;
    }

    public String getTööLisaInfo() {
        return tööLisaInfo;
    }

    public void setTööLisaInfo(String tööLisaInfo) {
        this.tööLisaInfo = tööLisaInfo;
    }

    public Date getTööTähtaeg() {
        return tööTähtaeg;
    }

    public void setTööTähtaeg(Date tööTähtaeg) {
        this.tööTähtaeg = tööTähtaeg;
    }

    public boolean isTööTehtud() {
        return tööTehtud;
    }

    public void setTööTehtud(boolean tööTehtud) {
        this.tööTehtud = tööTehtud;
    }
}
