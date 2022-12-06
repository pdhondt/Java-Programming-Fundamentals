package be.vdab.jpfhfdst13;

public abstract class Boek implements Voorwerp {
    private String titel;
    private String auteur;
    private float aankoopPrijs;
    private String genre;

    public Boek(String titel, String auteur, float aankoopPrijs, String genre) {
        setTitel(titel);
        setAuteur(auteur);
        setAankoopPrijs(aankoopPrijs);
        setGenre(genre);
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

    @Override
    public String toString() {
        return titel + " ; " + auteur + " ; " + EIGENAAR + " ; " + aankoopPrijs + " ; " + genre;
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
    }
}
