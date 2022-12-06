package be.vdab.jpfhfdst13;

public class Vrachtwagen2 extends Voertuig implements Vervuiler {

    private float maxLading;

    public Vrachtwagen2() {
        super();
        maxLading = 10_000.0F;
    }

    public Vrachtwagen2(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat, float maxLading) {
        super(polishouder, kostprijs, pk, gemVerbruik, nummerplaat);
        setMaxLading(maxLading);
    }

    public float getMaxLading() {
        return maxLading;
    }

    public final void setMaxLading(float maxLading) {
        if (maxLading > 0.0F) {
            this.maxLading = maxLading;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " ; " + maxLading;
    }

    @Override
    public void toon() {
        super.toon();
        System.out.println("Type voertuig: Vrachtwagen");
        System.out.println("Maximaal toegelaten lading: " + maxLading);
    }

    @Override
    public double getKyotoScore() {
        return (getGemVerbruik() + getPk()) / (maxLading / 1000);
    }

    @Override
    public double berekenVervuiling() {
        return getKyotoScore() * 20.0;
    }
}
