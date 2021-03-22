package AbstraktsedKlassid;

class PerenimiEesnimiLugeja extends IsikuFailistLugeja {
    protected Isik ridaIsikuks(String rida) {
        String[] nimeOsad = rida.split(", "); // Mallikas, Malle
        return new Isik(nimeOsad[1], nimeOsad[0]);
    }
}

