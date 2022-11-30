package be.vdab.jpfhfdst08;

public class GetalMain {
    public static void main(String[] args) {

        // var getal = new Getal();
        // System.out.println(getal.x);

        // System.out.println(getal.x) werkt niet meer
        // omdat x nu een private ipv public membervariabele is

        var getal = new Getal(-69);
        getal.print();

        System.out.println("De absolute waarde van membervariabele x is " + getal.absoluut());

        System.out.println("De som van membervariabele x en integer 128 is " + getal.som(128));

        getal.add(916);
        getal.print();

        System.out.println("De som van membervariabele x en float 135.38 is " + getal.som(135.38F));
        System.out.println("De som van membervariabele x en double 1357896.7386942 is " + getal.som(1357896.7386942D));

        System.out.println("De waarde van membervariabele x als double is " + getal.toDouble());

        System.out.println("We wijzigen de waarde van membervariabele x via een setter in 58");
        getal.setX(58);
        getal.print();
        System.out.println("De waarde van membervariabele x opgevraagd via een getter is " + getal.getX());
    }
}
