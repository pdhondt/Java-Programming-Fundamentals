package be.vdab.jpfhfdst08;

public class KaartMain {
    public static void main(String[] args) {

        var eersteKaart = new Kaart();
        System.out.println("De eerste kaart is " + eersteKaart.printKaart());
        var tweedeKaart = new Kaart();
        System.out.println("De tweede kaart is " + tweedeKaart.printKaart());

        System.out.println(eersteKaart.isHogerDan(tweedeKaart) ? "De eerste kaart is de hoogste" : "De tweede kaart is de hoogste");

    }
}
