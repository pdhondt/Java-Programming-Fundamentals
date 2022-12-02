package be.vdab.jpfhfdst11;

public class DebugVoorbeeld {

    public static void main(String[] args) {

//        var getal = Integer.parseInt("Hallo");
//        System.out.println(getal);

        var tekst = "Ik ben een Java Developer";
        System.out.println(plaatsAchterElkeStringEenPunt(tekst));

    }

    private static String plaatsAchterElkeStringEenPunt(String eenString) {
        if (!eenString.endsWith(".")) {
//            eenString.concat(".");
            eenString = eenString.concat(".");
        }
        return eenString;
    }
}
