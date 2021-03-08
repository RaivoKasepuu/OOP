public class Elektriauto {

    String mark;
    double elektriKulu;
    int laadimisAeg;
    int sõiduUlatus;
    Elektrijaam elektriJaam;

    public Elektriauto(String mark, double elektriKulu, int laadimisAeg, int sõiduUlatus, Elektrijaam elektriJaam) {
        this.mark = mark;
        this.elektriKulu = elektriKulu;
        this.laadimisAeg = laadimisAeg;
        this.sõiduUlatus = sõiduUlatus;
        this.elektriJaam = elektriJaam;
    }


    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getElektriKulu() {
        return elektriKulu;
    }

    public void setElektriKulu(double elektriKulu) {
        this.elektriKulu = elektriKulu;
    }

    public int getLaadimisAeg() {
        return laadimisAeg;
    }

    public void setLaadimisAeg(int laadimisAeg) {
        this.laadimisAeg = laadimisAeg;
    }

    public int getSõiduUlatus() {
        return sõiduUlatus;
    }

    public void setSõiduUlatus(int sõiduUlatus) {
        this.sõiduUlatus = sõiduUlatus;
    }

    public Elektrijaam getElektriJaam() {
        return elektriJaam;
    }

    public void setElektriJaam(Elektrijaam elektriJaam) {
        this.elektriJaam = elektriJaam;
    }

    public double maksumus100(){
        return elektriKulu * elektriJaam.getElektriHind();
    }

    public double maksumus(int teepikkus){
        return teepikkus * maksumus100()/100.0;
    }

    public double reisiKestus(int teepikkus, double keskmineKiirus){
        return (teepikkus / sõiduUlatus) * laadimisAeg/60 + teepikkus / keskmineKiirus;
    }

    @Override
    public String toString() {
        return "Elektriauto{" +
                "mark='" + mark + '\'' +
                ", elektriKulu=" + elektriKulu +
                ", laadimisAeg=" + laadimisAeg +
                ", sõiduUlatus=" + sõiduUlatus +
                ", elektriJaam=" + elektriJaam +
                '}';
    }
}
