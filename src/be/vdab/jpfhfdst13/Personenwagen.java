package be.vdab.jpfhfdst13;

public class Personenwagen extends Voertuig implements Vervuiler {

    private int aantalDeuren;
    private int aantalPassagiers;

    public Personenwagen() {
        super();
        aantalDeuren = 4;
        aantalPassagiers = 5;
    }

    public Personenwagen(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat, int aantalDeuren, int aantalPassagiers) {
        super(polishouder, kostprijs, pk, gemVerbruik, nummerplaat);
        setAantalDeuren(aantalDeuren);
        setAantalPassagiers(aantalPassagiers);
    }

    public int getAantalDeuren() {
        return aantalDeuren;
    }

    public final void setAantalDeuren(int aantalDeuren) {
        if (aantalDeuren > 0) {
            this.aantalDeuren = aantalDeuren;
        }
    }

    public int getAantalPassagiers() {
        return aantalPassagiers;
    }

    public final void setAantalPassagiers(int aantalPassagiers) {
        if (aantalPassagiers > 0) {
            this.aantalPassagiers = aantalPassagiers;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " ; " + aantalDeuren + " ; " + aantalPassagiers;
    }

    @Override
    public void toon() {
        super.toon();
        System.out.println("Type voertuig: Personenwagen");
        System.out.println("Aantal deuren: " + aantalDeuren);
        System.out.println("Aantal passagiers: " + aantalPassagiers);
    }

    @Override
    public double getKyotoScore() {
        return (getGemVerbruik() * getPk()) / aantalPassagiers;
    }

    @Override
    public double berekenVervuiling() {
        return getKyotoScore() * 5.0;
    }
}
