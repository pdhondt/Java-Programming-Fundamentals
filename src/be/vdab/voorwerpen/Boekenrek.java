package be.vdab.voorwerpen;

import be.vdab.util.Voorwerp;

public class Boekenrek implements Voorwerp {
    private int hoogte;
    private int breedte;
    private float aankoopprijs;
    private static final float WINSTMARGE = 2.0F;

    public Boekenrek() {
        this(200, 70, 135.0F);
    }

    public Boekenrek(int hoogte, int breedte, float aankoopprijs) {
        setHoogte(hoogte);
        setBreedte(breedte);
        setAankoopprijs(aankoopprijs);
    }

    public int getHoogte() {
        return hoogte;
    }

    public final void setHoogte(int hoogte) {
        if (hoogte > 0) {
            this.hoogte = hoogte;
        }
    }

    public int getBreedte() {
        return breedte;
    }

    public final void setBreedte(int breedte) {
        if (breedte > 0) {
            this.breedte = breedte;
        }
    }

    public float getAankoopprijs() {
        return aankoopprijs;
    }

    public final void setAankoopprijs(float aankoopprijs) {
        if (aankoopprijs > 0.0F) {
            this.aankoopprijs = aankoopprijs;
        }
    }

    public float getWINSTMARGE() {
        return WINSTMARGE;
    }

    @Override
    public String toString() {
        return EIGENAAR + " ; " + hoogte + " ; " + breedte  + " ; " + aankoopprijs + " ; " + WINSTMARGE;
    }

    @Override
    public float winstBerekenen() {
        return aankoopprijs * WINSTMARGE;
    }

    @Override
    public void gegevensTonen() {
        System.out.println("\nGegevens boekenrek:");
        System.out.println("Eigenaar: " + EIGENAAR);
        System.out.println("Hoogte: " + hoogte + "cm");
        System.out.println("Breedte: " + breedte + "cm");
        System.out.println("Aankoopprijs: " + aankoopprijs);
        System.out.println("De winst bedraagt " + winstBerekenen());
    }
}
