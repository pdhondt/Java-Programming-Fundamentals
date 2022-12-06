package be.vdab.jpfhfdst13;

public class Stookketel implements Vervuiler {

    private float CONorm;

    public Stookketel(float CONorm) {
        setCONorm(CONorm);
    }

    public float getCONorm() {
        return CONorm;
    }

    public void setCONorm(float CONorm) {
        if (CONorm > 0.0) {
            this.CONorm = CONorm;
        }
    }

    @Override
    public double berekenVervuiling() {
        return CONorm * 100;
    }
}
