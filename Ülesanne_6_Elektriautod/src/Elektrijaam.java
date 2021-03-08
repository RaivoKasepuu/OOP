public class Elektrijaam {

    double elektriHind;

    public Elektrijaam(double elektriHind) {
        this.elektriHind = elektriHind;
    }

    public double getElektriHind() {
        return elektriHind;
    }

    public void setElektriHind(double elektriHind) {
        this.elektriHind = elektriHind;
    }

    @Override
    public String toString() {
        return "Elektrijaam{" +
                "elektriHind=" + elektriHind +
                '}';
    }
}
