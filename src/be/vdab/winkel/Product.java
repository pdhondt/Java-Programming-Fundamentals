package be.vdab.winkel;

import java.util.Objects;

public class Product {
    private String omschrijving;
    private float prijs;

    public Product(String omschrijving, float prijs) {
        setOmschrijving(omschrijving);
        setPrijs(prijs);
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public final void setOmschrijving(String omschrijving) {
        if (!(omschrijving.trim().isEmpty())) {
            this.omschrijving = omschrijving;
        } else {
            throw new IllegalArgumentException(("Omschrijving moet ingevuld worden!"));
        }
    }

    public float getPrijs() {
        return prijs;
    }

    public final void setPrijs(float prijs) {
        if (prijs > 0) {
            this.prijs = prijs;
        } else {
            throw new IllegalArgumentException("Prijs moet groter zijn dan 0");
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "omschrijving='" + omschrijving + '\'' +
                ", prijs=" + prijs +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product p)) {
            return false;
        }
        return omschrijving.equals(p.getOmschrijving());
    }

    @Override
    public int hashCode() {
        return Objects.hash(omschrijving);
    }
}
