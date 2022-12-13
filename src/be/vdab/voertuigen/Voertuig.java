package be.vdab.voertuigen;

import be.vdab.util.Milieu;
import be.vdab.util.Privaat;

import java.util.Objects;

public abstract class Voertuig implements Privaat, Milieu, Comparable<Voertuig> {

    private String polishouder;
    private float kostprijs;
    private int pk;
    private float gemVerbruik;
    private String nummerplaat;

    public Voertuig() {
        polishouder = "onbepaald";
        nummerplaat = "onbepaald";
    }

    public Voertuig(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat) {
        setPolishouder(polishouder);
        setKostprijs(kostprijs);
        setPk(pk);
        setGemVerbruik(gemVerbruik);
        setNummerplaat(nummerplaat);
    }

    public String getPolishouder() {
        return polishouder;
    }

    // setters die ook gebruikt worden in de constructor maken we final
    // zodat deze niet overridden kunnen worden !!!
    public final void setPolishouder(String polishouder) {
        if (polishouder != null && !polishouder.isEmpty()) {
            this.polishouder = polishouder;
        }
    }

    public float getKostprijs() {
        return kostprijs;
    }

    public final void setKostprijs(float kostprijs) {
        if (kostprijs > 0.0F) {
            this.kostprijs = kostprijs;
        }
    }

    public int getPk() {
        return pk;
    }

    public final void setPk(int pk) {
        if (pk > 0) {
            this.pk = pk;
        }
    }

    public float getGemVerbruik() {
        return gemVerbruik;
    }

    public final void setGemVerbruik(float gemVerbruik) {
        if (gemVerbruik > 0.0F) {
            this.gemVerbruik = gemVerbruik;
        }
    }

    public String getNummerplaat() {
        return nummerplaat;
    }

    public final void setNummerplaat(String nummerplaat) {
        if (nummerplaat != null && !nummerplaat.isEmpty()) {
            this.nummerplaat = nummerplaat;
        }
    }

    @Override
    public String toString() {
        return polishouder + " ; " + kostprijs + " ; " + pk + " ; " + gemVerbruik + " ; " + nummerplaat;
    }

    public void toon() {
        System.out.println("\nOverzicht van de gegevens van dit voertuig:");
        System.out.println("Polishouder: " + polishouder);
        System.out.println("Kostprijs: " + kostprijs);
        System.out.println("Aantal PK: " + pk);
        System.out.println("Gemiddeld verbruik: " + gemVerbruik);
        System.out.println("Nummerplaat: " + nummerplaat);
    }

    public abstract double getKyotoScore();

    @Override
    public void geefPrivateData() {
        System.out.println("--- Private data van het voertuig ---");
        System.out.println("Polishouder: " + polishouder + ", nummerplaat: " + nummerplaat);
    }

    @Override
    public void geefMilieuData() {
        System.out.println("--- Milieu data van het voertuig ---");
        System.out.println("Aantal PK: " + pk + ", kostprijs: " + kostprijs + ", gemiddeld verbruik: " + gemVerbruik);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Voertuig voertuig)) {
            return false;
        }
        return nummerplaat.equals(voertuig.getNummerplaat());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nummerplaat);
        //return nummerplaat.hashCode();
    }

    @Override
    public int compareTo(Voertuig v) {
        return nummerplaat.compareTo(v.getNummerplaat());
    }
}
