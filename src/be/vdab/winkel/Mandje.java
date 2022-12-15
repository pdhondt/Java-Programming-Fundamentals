package be.vdab.winkel;

import java.util.HashMap;
import java.util.Map;

public class Mandje {
    private final Map<Product, Integer> inhoud = new HashMap<>();

    public Map<Product, Integer> getInhoud() {
        return inhoud;
    }

    public void add(Product product, int aantal) {
        valideerProduct(product);
        valideerAantal(aantal);
        if (!inhoud.containsKey(product)) {
            inhoud.put(product, aantal);
        } else {
            var oudeAantal = inhoud.get(product);
            inhoud.put(product, oudeAantal + aantal);
        }
    }

    //set method is overbodig, de add() method bevat deze functionaliteit al
   /* public void set(Product product, int aantal) {
    }*/

    public void remove(Product product) {
        valideerProduct(product);
        productAanwezigInMandje(product);
        inhoud.remove(product);
    }

    public void clear() {
        inhoud.clear();
    }

    public float getTotalePrijs() {
        var totalePrijs = 0F;
        for (var artikel : inhoud.entrySet()) {
            totalePrijs += artikel.getKey().getPrijs() * artikel.getValue() ;
        }
        return totalePrijs;
    }

    private void valideerProduct(Product product) {
        if (product == null) {
            throw new NullPointerException("Product moet ingevuld worden");
        }
    }

    private void valideerAantal(int aantal) {
        if (aantal <= 0) {
            throw new IllegalArgumentException("Aantal moet positief zijn");
        }
    }

    private void productAanwezigInMandje(Product product) {
        if (!(inhoud.containsKey(product))) {
            throw new IllegalArgumentException("Product niet aanwezig in mandje");
        }
    }

    @Override
    public String toString() {
        return "Mandje{" +
                "inhoud=" + inhoud +
                '}';
    }
}
