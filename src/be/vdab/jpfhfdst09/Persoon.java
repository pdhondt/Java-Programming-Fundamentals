package be.vdab.jpfhfdst09;

public record Persoon(String voornaam, String achternaam) {

    public Persoon {
        if (voornaam.isEmpty() || achternaam.isEmpty()) {
            throw new IllegalArgumentException("Voor -en achternaam mogen niet leeg zijn!");
        }
    }
}
