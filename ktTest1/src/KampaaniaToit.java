public class KampaaniaToit extends Toit{

private int soodustuseProtsent;

    public KampaaniaToit(String roog, double hind, int soodustuseProtsent) {
        super(roog, hind);
        this.soodustuseProtsent = soodustuseProtsent;
    }

    @Override
    public double getHind() {
        return super.getHind() * (100 - soodustuseProtsent) / 100;
    }

    @Override
    public String toString() {
        return "KampaaniaToit{" +
                " nimetus=" + super.getRoog() +
                " soodustuseProtsent=" + soodustuseProtsent +
                " soodusHind=" + getHind() +
                '}';
    }
}
