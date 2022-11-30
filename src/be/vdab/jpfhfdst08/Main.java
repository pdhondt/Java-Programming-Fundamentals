package be.vdab.jpfhfdst08;

public class Main {
    public static void main(String[] args) {
        double standSpaarrekening;

        var spaar1 = new Spaarrekening("BE12 3456 7890 1234", 1.5);
        var spaar2 = new Spaarrekening("BE98 7654 3210 9876", 1.5);
        var spaar3 = new Spaarrekening("BE65 4321 9876 5432", 1.5, 1000.0);

        spaar1.storten(100.0);
        standSpaarrekening = spaar1.getSaldo();
        System.out.println("Saldo van spaarrekening 1: " + standSpaarrekening);
        System.out.println("Saldo van spaarrekening 2: " + spaar2.getSaldo());

        spaar1.overschrijven(spaar2, 25.0);

        System.out.println("Saldo van spaarrekening 1 " + spaar1.getRekeningNummer() + " is " + spaar1.getSaldo());
        System.out.println("Saldo van spaarrekening 2 " + spaar2.getRekeningNummer() + " is " + spaar2.getSaldo());

        spaar2.afhalen(5.0);
        System.out.println("Saldo van spaarrekening 2 " + spaar2.getRekeningNummer() + " is " + spaar2.getSaldo());

        System.out.println("Saldo van spaarrekening 3 " + spaar3.getRekeningNummer() + " is " + spaar3.getSaldo());
    }
}
