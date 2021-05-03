public class VigaseVärviErind extends RuntimeException{

    public VigaseVärviErind (String s) {
        super("Vigane värvikood (peab olema vahemikus 0 ... 255): "+ s);
    }
}