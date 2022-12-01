package be.vdab.jpfhfdst08;

public class Waarnemer {

    private int minTemp = Integer.MAX_VALUE; // maximale waarde van een instance van de Integer klasse
    private int maxTemp = Integer.MIN_VALUE; // minimale waarde van een instance van de Integer klasse
    private int aantalWaarnemingen;
    private float somTemp;

    public int getMinTemp() {
        return aantalWaarnemingen > 0 ? minTemp : 0;
    }

    public int getMaxTemp() {
        return aantalWaarnemingen > 0 ? maxTemp : 0;
    }

    public int getAantalWaarnemingen() {
        return aantalWaarnemingen;
    }

    public void registreerTemp(int temperatuur) {
        aantalWaarnemingen++;
        if (temperatuur < minTemp) {
            minTemp = temperatuur;
        }
        if (temperatuur > maxTemp) {
            maxTemp = temperatuur;
        }
        somTemp += temperatuur;
    }

    public float getAvgTemp() {
        return aantalWaarnemingen > 0 ? somTemp / aantalWaarnemingen : 0;
    }

}
