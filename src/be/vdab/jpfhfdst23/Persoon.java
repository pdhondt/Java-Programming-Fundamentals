package be.vdab.jpfhfdst23;

import java.time.LocalDate;

/**
 * Deze klasse stelt een persoon voor.
 * Een persoon heeft een voornaam, een achternaam, een geboortedatum en een geslacht.
 *
 * @author Peter D'hondt
 * @version 1.0
 */

public class Persoon {
    private String voornaam, achternaam;
    private LocalDate geboortedatum;
    /**
     * Het geslacht van deze persoon
     * @see be.vdab.jpfhfdst23.Geslacht
     */
    public Geslacht geslacht;

    /**
     * Deze constructor maakt een persoon aan met al zijn verplichte eigenschappen
     *
     * @param voornaam      De voornaam van de persoon
     * @param achternaam    De achternaam van de persoon
     * @param geboortedatum De geboortedatum van de persoon in formaat yyyy-MM-dd
     * @param geslacht      Het geslacht van de persoon
     */
    public Persoon(String voornaam, String achternaam, LocalDate geboortedatum, Geslacht geslacht) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.geboortedatum = geboortedatum;
        this.geslacht = geslacht;
    }

    /**
     * Geeft de voornaam van de persoon terug
     * De persoon zijn voornaam kan meegegeven worden door gebruik te maken
     * van de constructor.
     * {@link be.vdab.jpfhfdst23.Persoon#Persoon(String, String, LocalDate, Geslacht)}
     * Als je nadien de voornaam wil wijzigen kan je gebruik maken van de setter
     * {@link be.vdab.jpfhfdst23.Persoon#setVoornaam(String)}
     *
     * @return De voornaam van de persoon
     */
    public String getVoornaam() {
        return voornaam;
    }

    /**
     * Deze setter stelt de membervariabele voornaam van een persoon in
     * aan de hand van de parameter voornaam
     * Als je nadien de voornaam wil weergeven kan je gebruik maken van de getter
     * {@link Persoon#getVoornaam()}
     *
     * @param voornaam  De voornaam van de persoon
     */
    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    /**
     Geeft de achternaam van de persoon terug
     * De persoon zijn achternaam kan meegegeven worden door gebruik te maken
     * van de constructor.
     * {@link be.vdab.jpfhfdst23.Persoon#Persoon(String, String, LocalDate, Geslacht)}
     * Als je nadien de achternaam wil wijzigen kan je gebruik maken van de setter
     * {@link be.vdab.jpfhfdst23.Persoon#setAchternaam(String)}
     *
     * @return De achternaam van de persoon
     */
    public String getAchternaam() {
        return achternaam;
    }

    /**
     * Deze setter stelt de membervariabele achternaam van een persoon in
     * aan de hand van de parameter achternaam
     * Als je nadien de achternaam wil weergeven kan je gebruik maken van de getter
     * {@link Persoon#getAchternaam()}
     *
     * @param achternaam  De achternaam van de persoon
     */
    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    /**
     Geeft de geboortedatum van de persoon terug
     * De persoon zijn geboortedatum kan meegegeven worden door gebruik te maken
     * van de constructor.
     * {@link be.vdab.jpfhfdst23.Persoon#Persoon(String, String, LocalDate, Geslacht)}
     * Als je nadien de geboortedatum wil wijzigen kan je gebruik maken van de setter
     * {@link be.vdab.jpfhfdst23.Persoon#setGeboortedatum(LocalDate)}
     *
     * @return De geboortedatum van de persoon
     */
    public LocalDate getGeboortedatum() {
        return geboortedatum;
    }

    /**
     * Deze setter stelt de membervariabele geboortedatum van een persoon in
     * aan de hand van de parameter geboortedatum
     * Als je nadien de geboortedatum wil weergeven kan je gebruik maken van de getter
     * {@link Persoon#getGeboortedatum()}
     *
     * @param geboortedatum  De geboortedatum van de persoon
     */
    public void setGeboortedatum(LocalDate geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    /**
     Geeft het geslacht van de persoon terug
     * De persoon zijn geslacht kan meegegeven worden door gebruik te maken
     * van de constructor.
     * {@link be.vdab.jpfhfdst23.Persoon#Persoon(String, String, LocalDate, Geslacht)}
     * Als je nadien het geslacht wil wijzigen kan je gebruik maken van de setter
     * {@link be.vdab.jpfhfdst23.Persoon#setGeslacht(Geslacht)}
     *
     * @return Het geslacht van de persoon
     */
    public Geslacht getGeslacht() {
        return geslacht;
    }

    /**
     * Deze setter stelt de membervariabele geslacht van een persoon in
     * aan de hand van de parameter geslacht
     * Als je nadien het geslacht wil weergeven kan je gebruik maken van de getter
     * {@link Persoon#getGeslacht()}
     *
     * @param geslacht  Het geslacht van de persoon
     */
    public void setGeslacht(Geslacht geslacht) {
        this.geslacht = geslacht;
    }
}
