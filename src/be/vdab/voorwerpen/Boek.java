package be.vdab.voorwerpen;

import be.vdab.util.Isbn13Exception;
import be.vdab.util.Voorwerp;

import java.util.regex.PatternSyntaxException;

public abstract class Boek implements Voorwerp {
    private String titel;
    private String auteur;
    private float aankoopPrijs;
    private String genre;
    private String isbn13;

    public Boek(String titel, String auteur, float aankoopPrijs, String genre, String isbn13) throws Isbn13Exception {
        setTitel(titel);
        setAuteur(auteur);
        setAankoopPrijs(aankoopPrijs);
        setGenre(genre);
        setIsbn13(isbn13);
    }

    public String getTitel() {
        return titel;
    }

    public final void setTitel(String titel) {
        if (titel != null && !titel.isEmpty()) {
            this.titel = titel;
        }
    }

    public String getAuteur() {
        return auteur;
    }

    public final void setAuteur(String auteur) {
        if (auteur != null && !auteur.isEmpty()) {
            this.auteur = auteur;
        }
    }

    public float getAankoopPrijs() {
        return aankoopPrijs;
    }

    public final void setAankoopPrijs(float aankoopPrijs) {
        if (aankoopPrijs > 0.0F) {
            this.aankoopPrijs = aankoopPrijs;
        }
    }

    public String getGenre() {
        return genre;
    }

    public final void setGenre(String genre) {
        if (genre != null && !genre.isEmpty()) {
            this.genre = genre;
        }
    }

    public String getIsbn13() {
        return isbn13;
    }

    public final void setIsbn13(String isbn13) throws Isbn13Exception {
        if (checkISBNnummer(isbn13)) {
            this.isbn13 = isbn13;
        } else {
            throw new Isbn13Exception("Dit is geen geldig ISBN nummer!", isbn13);
        }
    }

    @Override
    public String toString() {
        return titel + " ; " + auteur + " ; " + EIGENAAR + " ; " + aankoopPrijs + " ; " + genre + " ; " + isbn13;
    }

    /*@Override
    public abstract float winstBerekenen();*/

    @Override
    public void gegevensTonen() {
        System.out.println("\nGegevens van dit boek:");
        System.out.println("Titel: " + titel);
        System.out.println("Auteur: " + auteur);
        System.out.println("Eigenaar: " + EIGENAAR);
        System.out.println("Aankoopprijs: " + aankoopPrijs);
        System.out.println("Genre: " + genre);
        System.out.println("ISBN nummer: " + isbn13);
    }

    private boolean checkISBNnummer(String isbn13) {
        if (isbn13 == null || isbn13.isEmpty()) {
            return false;
        }
        try {
            //kortere manier om de streepjes te verwijderen is via de replaceAll() String method
            //isbn13.replaceAll("-", "");
            var isbn13ZonderStreepjes = new StringBuilder();
            for (var i = 0; i < isbn13.length(); i++) {
                if (!(isbn13.charAt(i) == '-')) {
                    isbn13ZonderStreepjes.append(isbn13.charAt(i));
                }
            }
            //CONTROLE LENGTE VAN 13 TEKENS NIET VERGETEN !!!
            if (isbn13ZonderStreepjes.length() != 13) {
                return false;
            }
            isbn13 = isbn13ZonderStreepjes.toString();
            var isbn13Array = isbn13.split("");
            var som = 0;
            for (var j = 0; j < 12; j++) {
                if (j % 2 == 0) {
                    som += Integer.parseInt(isbn13Array[j]);
                }
                if (j % 2 != 0) {
                    som += Integer.parseInt(isbn13Array[j]) * 3;
                }
            }
            var resultaat = (10 - (som % 10)) == 10 ? 0 : (10 - (som % 10));
            return resultaat == Integer.parseInt(isbn13Array[12]);
        }
        catch (IndexOutOfBoundsException | PatternSyntaxException | NumberFormatException ex) {
            return false;
        }
    }
}
