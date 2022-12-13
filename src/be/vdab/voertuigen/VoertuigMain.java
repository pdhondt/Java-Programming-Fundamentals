package be.vdab.voertuigen;

import java.util.TreeSet;

public class VoertuigMain {
    public static void main(String[] args) {
        var voertuigen = new TreeSet<Voertuig>();
        voertuigen.add(new Personenwagen("Piet", 35000.0F, 120, 6.3F, "1-XYZ-456", 3, 7));
        voertuigen.add(new Vrachtwagen2("Jan", 150000.0F, 300, 15.5F, "1-ABC-789", 12000.0F));
        voertuigen.add(new Vrachtwagen2("Joris", 225000.0F, 350, 23.0F, "1-CDE-357", 13500.0F));
        voertuigen.add(new Personenwagen("Corneel", 25000.0F, 120, 5.9F, "1-KLM-159", 2, 3));

        for (var voertuig : voertuigen) {
            voertuig.toon();
        }

    }
}
