package be.vdab.jpfhfdst22;

import java.time.LocalTime;

public class Klok implements Runnable {

    @Override
    public void run() {
        var verderDoen = true;
        while (verderDoen) {
            System.out.println(LocalTime.now());
            /*if (Thread.interrupted()) {
                verderDoen = false;  // klok wordt stopgezet
            }*/
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                //System.err.println(ex);
                verderDoen = false;  // klok wordt stopgezet
            }
        }
    }
}
