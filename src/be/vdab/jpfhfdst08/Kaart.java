package be.vdab.jpfhfdst08;

import java.util.Objects;

public class Kaart {

    // Zie voorbeeldoplossing cursus voor kortere manier
    // kleur en rang niet als String maar als int definiëren
    // Op die manier kan de hoogste kleur en/of rang rechtstreeks bepaald worden, zonder de findIndexOf() methode
    // Om de kleur en de rang te kunnen tonen, maak je een getKleur() en getRang() methode, die de waarde
    // uit de betreffende arrays haalt aan de hand van de kleur/rang integer

    private final String kleur;
    private final String rang;
    private static final String[] kleuren = {"harten", "ruiten", "klaveren", "schoppen"};
    private static final String[] rangen = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "boer", "vrouw", "heer", "aas"};


    public Kaart() {
        kleur = kleuren[(int) (Math.random() * 4)];
        rang = rangen[(int) (Math.random() * 13)];
    }

    public String printKaart() {
        return kleur + " " + rang;
    }

    public boolean isHogerDan(Kaart kaart) {
        var kleurIndex = findIndexOf(kleur, kleuren);
        var kleurIndexKaart = findIndexOf(kaart.kleur, kleuren);
        if (kleurIndex < kleurIndexKaart) {
            return false;
        } else if (kleurIndex > kleurIndexKaart) {
            return true;
        } else {
            var rangIndex = findIndexOf(rang, rangen);
            var rangIndexKaart = findIndexOf(kaart.rang, rangen);
            return rangIndex > rangIndexKaart;
        }
    }

    private int findIndexOf(String element, String[] soorten) {
        int index = 0;
        for (var i = 0; i < soorten.length; i++) {
            if (Objects.equals(element, soorten[i])) {
                index = i;
            }
        }
        return index;
    }

}


