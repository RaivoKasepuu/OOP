public class Paar<A,B> {

    private A first;
    private B second;

    public Paar (A first, B second) {
        this.first = first;
        this.second = second;

    }

    public A getEsimene() {
        return first;
    }

    public void setEsimene(A first) {
        this.first = first;
    }

    public B getTeine() {
        return second;
    }

    public void setTeine(B second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Paar{" + "teine = " + second + ", esimene = " + first + "}";
    }

    public static void main(String[] args) {
        Paar<String , Integer> paar1 = new Paar<String, Integer>("Nimi", 2011);
        Paar<String , String> paar2 = new Paar<String, String>("Nimi", "Nimi999");
    }
}
