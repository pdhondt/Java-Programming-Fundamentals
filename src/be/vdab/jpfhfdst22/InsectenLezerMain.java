package be.vdab.jpfhfdst22;

public class InsectenLezerMain {

    // main via class InsectenLezer die erft van class Thread
    /*
    public static void main(String[] args) {
        var thread1 = new InsectenLezer("/data/insecten1.csv", System.out);
        var thread2 = new InsectenLezer("/data/insecten2.csv", System.err);
        thread1.start();
        thread2.start();
    }
     */

    // main via class InsectenLezer die interface Runnable implementeert
    public static void main(String[] args) {
        var lezer1 = new InsectenLezer("/data/insecten1.csv", System.out);
        var thread1 = new Thread(lezer1);
        var lezer2 = new InsectenLezer("/data/insecten2.csv", System.err);
        var thread2 = new Thread(lezer2);
        thread1.start();
        thread2.start();
        // zonder join() geeft volgende lijn een verkeerd resultaat
        //System.out.println(lezer1.getAantalRegels() + lezer2.getAantalRegels() + " regels");
        // met join() wordt er gewacht tot de run() method van de andere thread afgelopen is
        // alvorens met de resultaten van de run() methodes aan de slag te gaan (hier dus de som te maken)
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            System.err.println(ex);
        }
        System.out.println(lezer1.getAantalRegels() + lezer2.getAantalRegels() + " regels");
    }
}
