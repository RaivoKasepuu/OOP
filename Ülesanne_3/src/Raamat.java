public class Raamat {

    private String autor;
    private String pealkiri;


    public Raamat(String autor, String pealkiri) {
        this.autor = autor;
        this.pealkiri = pealkiri;
    }

    @Override
    public String toString() {
        return "Raamat{" +
                "autor='" + autor + '\'' +
                ", pealkiri='" + pealkiri + '\'' +
                '}';
    }
}
