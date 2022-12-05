package be.vdab.jpfhfdst13;

public class Vrachtwagen implements Kost, Afschrijving {

    private final String merk;
    private final double kostPerKm;
    private final int aantalKm;
    private final double aankoopPrijs;
    private final int voorzieneLevensDuur;

    public Vrachtwagen(String merk, double kostPerKm, int aantalKm, double aankoopPrijs, int voorzieneLevensDuur) {
        this.merk = merk;
        this.kostPerKm = kostPerKm;
        this.aantalKm = aantalKm;
        this.aankoopPrijs = aankoopPrijs;
        this.voorzieneLevensDuur = voorzieneLevensDuur;
    }

    @Override
    public int termijn() {
        return voorzieneLevensDuur;
    }

    @Override
    public double jaarlijksBedrag() {
        return aankoopPrijs / voorzieneLevensDuur;
    }

    @Override
    public double bedragKost() {
        return kostPerKm * aantalKm;
    }

    @Override
    public boolean personeelsKost() {
        return false;
    }

    public String getMerk() {
        return merk;
    }

    public int getAantalKm() {
        return aantalKm;
    }
}
