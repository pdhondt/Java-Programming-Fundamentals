package be.vdab.jpfhfdst08;

public class Getal {

    // public int x;
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int a) {
        this.x = a;
    }

    public Getal (int a) {
        // x = a;
        setX(a);
    }

    public void print() {
        System.out.println("De waarde van membervariabele x is " + this.x);
    }

    public int absoluut() {
        return Math.abs(this.x);
    }

    public int som(int a) {
        return this.x + a;
    }

    public void add(int a) {
        this.x += a;
    }

    public float som(float a) {
        return this.x + a;
    }

    public double som(double a) {
        return this.x + a;
    }

    public double toDouble() {
        return (double) this.x;
    }
}
