public class Raamat {

    private Isik autor;
    private String pealkiri;


    public Raamat(Isik autor, String pealkiri) {
        this.autor = autor;
        this.pealkiri = pealkiri;
    }

    @Override
    public String toString() {
        return "Raamat{" +
                "autor=" + autor +
                ", pealkiri='" + pealkiri + '\'' +
                '}';
    }
}
