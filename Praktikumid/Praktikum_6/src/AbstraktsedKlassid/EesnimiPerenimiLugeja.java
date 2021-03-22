package AbstraktsedKlassid;

class EesnimiPerenimiLugeja extends IsikuFailistLugeja {
    protected Isik ridaIsikuks(String rida) {
        String[] nimeOsad = rida.split(" "); // Malle Mallikas
        return new Isik(nimeOsad[0], nimeOsad[1]);
    }
}
