package be.vdab.winkel;

import java.util.HashSet;
import java.util.Set;

public class Catalogus {
    private final Set<Product> producten = new HashSet<>();

    public Catalogus() {
        producten.add(new Product("Wielen Carbon", 1500F));
        producten.add(new Product("Buitenband Race", 45F));
        producten.add(new Product("Binnenband Race", 5.5F));
        producten.add(new Product("Cassette 28-11", 75.6F));
        producten.add(new Product("Ketting", 27.3F));
        producten.add(new Product("Remschijf", 29.4F));
        producten.add(new Product("Remblokken", 15.2F));
        producten.add(new Product("Zadel", 158.8F));
    }

    public Set<Product> getProducten() {
        return producten;
    }

    @Override
    public String toString() {
        return "Catalogus{" +
                "producten=" + producten +
                '}';
    }
}
