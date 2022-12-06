package be.vdab.jpfhfdst13;

import java.text.DecimalFormat;

public class TestProgramma {
    public static void main(String[] args) {

        var vrachtwagen1 = new Vrachtwagen2();
        var vrachtwagen2 = new Vrachtwagen2("Jan", 150000.0F, 300, 15.5F, "1-ABC-789", 12000.0F);
        var personenwagen1 = new Personenwagen();
        var personenwagen2 = new Personenwagen("Piet", 35000.0F, 120, 6.3F, "1-XYZ-456", 3, 7);

        var fmt = new DecimalFormat("#0.00");

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
        voertuigen[0] = new Vrachtwagen2("Joris", 225000.0F, 350, 23.0F, "1-CDE-357", 13500.0F);
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

        System.out.println("\nResultaat method berekenVervuiling() van interface Vervuiler:");
        var vervuilers = new Vervuiler[3];
        vervuilers[0] = vrachtwagen2;
        vervuilers[1] = personenwagen2;
        vervuilers[2] = new Stookketel(2.75F);
        for (var vervuiler : vervuilers) {
            System.out.println("De vervuiling bedraagt " + fmt.format(vervuiler.berekenVervuiling()));
        }

        System.out.println("\nResultaat method geefPrivateData() van interface Privaat");
        var privateGegevens = new Privaat[4];
        privateGegevens[0] = vrachtwagen2;
        privateGegevens[1] = new Vrachtwagen2("Joris", 225000.0F, 350, 23.0F, "1-CDE-357", 13500.0F);
        privateGegevens[2] = personenwagen2;
        privateGegevens[3] = new Personenwagen("Corneel", 25000.0F, 120, 5.9F, "1-KLM-159", 2, 3);
        for (var element : privateGegevens) {
            element.geefPrivateData();
        }

        System.out.println("\nTest methodes op array van objecten van type Milieu");
        var milieuGegevens = new Milieu[2];
        milieuGegevens[0] = vrachtwagen2;
        milieuGegevens[1] = personenwagen2;
        for (var element : milieuGegevens) {
            element.geefMilieuData();
        }

        //Op objecten van type Milieu is enkel en alleen de method geefMilieuData() toegankelijk, aangezien dit de enige
        //method is die in de interface beschreven is
        //Om zowel de methods uit de interface als uit objecten van type Voertuig (dus ook objecten van type Vrachtwagen
        //en Personenwagen) te kunnen uitvoeren, moeten er objecten aangemaakt worden van deze types.

        //milieuGegevens[0].geefPrivateData();
        //milieuGegevens[1].getAantalDeuren();

        System.out.println("\nOp objecten van type Voertuig zijn deze methods wel toegankelijk, aangezien" +
                " de klasse Voertuig de interfaces Privaat en Milieu implementeert");
        voertuigen[0].geefMilieuData();
        voertuigen[1].geefPrivateData();

        System.out.println("\nOok op objecten van type Vrachtwagen of Personenwagen zijn de methods uit de" +
                " interfaces Privaat en Milieu toegankelijk, aangezien dit afgeleide klasses zijn van" +
                " Voertuig, en Voertuig deze interfaces implementeert!");
        vrachtwagen2.geefMilieuData();
        personenwagen2.geefPrivateData();

    }
}
