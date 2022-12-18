package be.vdab.jpfhfdst22;

import java.util.concurrent.CopyOnWriteArrayList;

public class GemiddeldeRekenaar implements Runnable {
    private final CopyOnWriteArrayList<Double> getallen;
    private double gemiddelde;

    public GemiddeldeRekenaar(CopyOnWriteArrayList<Double> getallen) {
        this.getallen = getallen;
    }

    @Override
    public void run() {
        var som = 0.0;
        for (var getal : getallen) {
            som += getal;
        }
        gemiddelde =  som / getallen.size();
    }

    public double getGemiddelde() {
        return gemiddelde;
    }
}
