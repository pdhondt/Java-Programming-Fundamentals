package be.vdab.jpfhfdst20;

import java.util.Objects;

public class TienKamper implements Comparable<TienKamper> {
    private String naam;
    private int punten;

    public TienKamper(String naam, int punten) {
        setNaam(naam);
        setPunten(punten);
    }

    public String getNaam() {
        return naam;
    }

    public final void setNaam(String naam) {
        if (naam != null && !(naam.trim().isEmpty())) {
            this.naam = naam;
        }
    }

    public int getPunten() {
        return punten;
    }

    public final void setPunten(int punten) {
        if (punten >= 0) {
            this.punten = punten;
        }
    }

    @Override
    public String toString() {
        return "TienKamper{" +
                "naam='" + naam + '\'' +
                ", punten=" + punten +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TienKamper tienkamper)) {
            return false;
        }
        return naam.equals(tienkamper.naam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam);
    }

    @Override
    public int compareTo(TienKamper t) {
        return naam.compareTo(t.naam);
    }

}
