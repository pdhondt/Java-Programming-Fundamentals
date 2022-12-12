package be.vdab.jpfhfdst20;

import be.vdab.util.LandException;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Land {
    private String landCode, landNaam, hoofdstad;
    BigInteger aantalInwoners;
    BigDecimal oppervlakte;

    public Land(String landCode, String landNaam, String hoofdstad, BigInteger aantalInwoners, BigDecimal oppervlakte) {
        setLandCode(landCode);
        setLandNaam(landNaam);
        setHoofdstad(hoofdstad);
        setAantalInwoners(aantalInwoners);
        setOppervlakte(oppervlakte);
    }

    public String getLandCode() {
        return landCode;
    }

    public final void setLandCode(String landCode) {
        if (landCode != null && !landCode.trim().isEmpty()) {
            this.landCode = landCode;
        } else {
            throw new LandException("Geen landcode ingevuld!");
        }
    }

    public String getLandNaam() {
        return landNaam;
    }

    public final void setLandNaam(String landNaam) {
        if (landNaam != null && !landNaam.trim().isEmpty()) {
            this.landNaam = landNaam;
        } else {
            throw new LandException("Geen landnaam ingevuld!");
        }
    }

    public String getHoofdstad() {
        return hoofdstad;
    }

    public final void setHoofdstad(String hoofdstad) {
        if (hoofdstad != null && !hoofdstad.trim().isEmpty()) {
            this.hoofdstad = hoofdstad;
        } else {
            throw new LandException("Geen hoofdstad ingevuld!");
        }
    }

    public BigInteger getAantalInwoners() {
        return aantalInwoners;
    }

    public void setAantalInwoners(BigInteger aantalInwoners) {
        //if (aantalInwoners.intValue() > 0) {
        if (aantalInwoners.compareTo(BigInteger.ZERO) > 0) {
            this.aantalInwoners = aantalInwoners;
        } else {
            throw new LandException("Aantal inwoners moet groter zijn dan nul!");
        }
    }

    public BigDecimal getOppervlakte() {
        return oppervlakte;
    }

    public void setOppervlakte(BigDecimal oppervlakte) {
        //if (oppervlakte.intValue() > 0) {
        if (oppervlakte.compareTo(BigDecimal.ZERO) > 0) {
            this.oppervlakte = oppervlakte;
        } else {
            throw new LandException("Oppervlakte moet groter zijn dan nul!");
        }

    }

    public BigDecimal getBevolkingsDichtheid() {
        var aantalInwonersBigDecimal = new BigDecimal(aantalInwoners);
        return aantalInwonersBigDecimal.divide(oppervlakte, 2, RoundingMode.HALF_UP);
    }

    @Override
    public String toString() {
        return landCode + " ; " + landNaam + " ; " + hoofdstad + " ; " + aantalInwoners + " ; " + oppervlakte + " ; " +
                getBevolkingsDichtheid();
    }
}
