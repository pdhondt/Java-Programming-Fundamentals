package be.vdab.jpfhfdst10;

public class TestProgramma {
    public static void main(String[] args) {

        var vrachtwagen1 = new Vrachtwagen();
        var vrachtwagen2 = new Vrachtwagen("Jan", 150000.0F, 300, 15.5F, "1-ABC-789", 12000.0F);
        var personenwagen1 = new Personenwagen();
        var personenwagen2 = new Personenwagen("Piet", 35000.0F, 120, 6.3F, "1-XYZ-456", 3, 7);

        System.out.println("\ntoString() vrachtwagen1:");
        System.out.println(vrachtwagen1);

        System.out.println("\ntoString() vrachtwagen2:");
        System.out.println(vrachtwagen2);

        System.out.println("\ntoString() personenwagen1:");
        System.out.println(personenwagen1);

        System.out.println("\ntoString() personenwagen2");
        System.out.println(personenwagen2);

        vrachtwagen1.toon();
        vrachtwagen2.toon();
        personenwagen1.toon();
        personenwagen2.toon();

        // testen of de validaties werken en de waardes dus niet aangepast worden
        personenwagen2.setKostprijs(-25000);
        personenwagen2.setAantalDeuren(-3);
        personenwagen2.setAantalPassagiers(0);
        System.out.println("\nTest validaties personenwagen2");
        System.out.println(personenwagen2);

        System.out.println("\nKyotoscore vrachtwagen1: " + vrachtwagen1.getKyotoScore());
        System.out.println("Kyotoscore vrachtwagen2: " + vrachtwagen2.getKyotoScore());
        System.out.println("Kyotoscore personenwagen1: " + personenwagen1.getKyotoScore());
        System.out.println("Kyotoscore personenwagen2: " + personenwagen2.getKyotoScore());

        // POLYMORFISME
        var voertuigen = new Voertuig[4];
        voertuigen[0] = new Vrachtwagen("Joris", 225000.0F, 350, 23.0F, "1-CDE-357", 13500.0F);
        voertuigen[1] = vrachtwagen2;
        voertuigen[2] = new Personenwagen("Corneel", 25000.0F, 120, 5.9F, "1-KLM-159", 2, 3);
        voertuigen[3] = personenwagen2;

        System.out.println("\nGegevens voertuigen via toString() vanuit array met voertuigen:\n");
        for (var voertuig : voertuigen) {
            if (voertuig != null) {
                System.out.println(voertuig);
            }
        }

        System.out.println("\nGegevens voertuigen via toon() vanuit array met voertuigen:");
        for (var voertuig : voertuigen) {
            if (voertuig != null) {
                voertuig.toon();
            }
        }
    }
}
