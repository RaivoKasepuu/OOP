public class Paar<T,K> {

    private T first;
    private K second;

    public Paar (T first, K second) {
        this.first = first;
        this.second = second;

    }

    public T getEsimene() {
        return first;
    }

    public void setEsimene(T first) {
        this.first = first;
    }

    public K getTeine() {
        return second;
    }

    public void setTeine(K second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Paar{" + "teine = " + second + ", esimene = " + first + "}";
    }

    public static void main(String[] args) {
        Paar<String , Integer> paar1 = new Paar<String, Integer>("Nimi", 2011);
        Paar<String , String> paar2 = new Paar<String, String>("Nimi", "Nimi2");
    }
}
