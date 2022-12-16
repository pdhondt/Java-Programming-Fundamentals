package be.vdab.gastenboek;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GastenboekEntry implements Serializable {
    private String datum, schrijver, boodschap;
    @Serial
    private static final long serialVersionUID = 1L;

    public GastenboekEntry(String schrijver, String boodschap) {
        setDatum();
        setSchrijver(schrijver);
        setBoodschap(boodschap);
    }

    public String getDatum() {
        return datum;
    }

    public final void setDatum() {
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        this.datum = formatter.format(LocalDateTime.now());
    }

    public String getSchrijver() {
        return schrijver;
    }

    public final void setSchrijver(String schrijver) {
        if (schrijver.trim().isEmpty()) {
            throw new IllegalArgumentException("Schrijver moet ingevuld zijn");
        } else {
            this.schrijver = schrijver;
        }
    }

    public String getBoodschap() {
        return boodschap;
    }

    public final void setBoodschap(String boodschap) {
        if (boodschap.trim().isEmpty()) {
            throw new IllegalArgumentException("Boodschap moet ingevuld zijn");
        } else {
            this.boodschap = boodschap;
        }
    }

    @Override
    public String toString() {
        return "GastenboekEntry{" +
                "datum=" + datum +
                ", schrijver='" + schrijver + '\'' +
                ", boodschap='" + boodschap + '\'' +
                '}';
    }
}
