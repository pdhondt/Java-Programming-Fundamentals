package be.vdab.jpfhfdst22;

import java.util.concurrent.CopyOnWriteArrayList;

public class GemiddeldeRekenaarMain {
    public static void main(String[] args) {
        var getallen = new CopyOnWriteArrayList<Double>();
        var getallen1 = new CopyOnWriteArrayList<Double>();
        var getallen2 = new CopyOnWriteArrayList<Double>();
        for (var z = 0; z < 1000000; z++) {
            getallen.add(Math.random());
            System.out.println(z + " - " + getallen.get(z));
            if (z < 500000) {
                getallen1.add(getallen.get(z));
            } else {
                getallen2.add(getallen.get(z));
            }
        }

        for (var getal : getallen1) {
            System.out.println("\n*** getallen1 ***");
            System.out.println(getal);
        }

        for (var getal : getallen2) {
            System.out.println("\n*** getallen2 ***");
            System.out.println(getal);
        }

        var gemiddeldeRekenaar1 = new GemiddeldeRekenaar(getallen1);
        var gemiddeldeRekenaar2 = new GemiddeldeRekenaar(getallen2);
        var thread1 = new Thread(gemiddeldeRekenaar1);
        var thread2 = new Thread(gemiddeldeRekenaar2);
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            System.err.println(ex);
        }

        System.out.println("\nHet gemiddelde bedraagt " +
                (gemiddeldeRekenaar1.getGemiddelde() + gemiddeldeRekenaar2.getGemiddelde()) / 2);

    }
}
