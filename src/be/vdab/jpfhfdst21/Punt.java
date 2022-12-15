package be.vdab.jpfhfdst21;

import java.io.Serial;
import java.io.Serializable;

public class Punt implements Serializable {
    private final int x;
    private final int y;
    @Serial
    private static final long serialVersionUID = 1L;

    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Punt{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
