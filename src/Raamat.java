public class Raamat {

    private String autor;
    private String pealkiri;

    public Raamat(String autor, String pealkiri) {
        this.autor = autor;
        this.pealkiri = pealkiri;
    }

    public String toString() {
        return "Autor: " + autor + " " + ", pealkiri: " + pealkiri;
    }

}
