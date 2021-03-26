public class KampaaniaToit extends Toit{

    private int soodusProtsent;

    public KampaaniaToit(String nimetus, double hind, int soodusProtsent) {
        super(nimetus, hind);
        this.soodusProtsent = soodusProtsent;
    }

    @Override
    public double getHind () {
        return super.getHind()*(100 - soodusProtsent) / 100;
    }

    @Override
    public String toString() {
        return "KampaaniaToit{" +
                "  soodusProtsent= " + soodusProtsent +
                "  soodushind= " + getHind() +
                '}';
    }
}
