package be.vdab.jpfhfdst18;

public class Main {
    public static void main(String[] args) {
        var zaaiSeizoen = Seizoen.LENTE;
        var skiSeizoen = Seizoen.WINTER;
        System.out.println(zaaiSeizoen);
        System.out.println(skiSeizoen);

        for (var seizoen : Seizoen.values()) {
            System.out.println(seizoen);
            System.out.println(seizoen.getBeginMaand());
        }

        var zwemSeizoen = Seizoen.valueOf("ZOMER");
        System.out.println(zwemSeizoen);
        System.out.println(zwemSeizoen.ordinal());
        System.out.println(zaaiSeizoen.ordinal());
        System.out.println(skiSeizoen.ordinal());

        var vallendeBladerenSeizoen = Seizoen.HERFST;
        System.out.println(vallendeBladerenSeizoen);
        System.out.println(vallendeBladerenSeizoen.ordinal());

        var man = new Persoon("Bart", "Simpson", Geslacht.MAN);
        System.out.println(man);
        var vrouw = new Persoon("Marge", "Simpson", Geslacht.VROUW);
        System.out.println(vrouw);
        var x = new Persoon("R2", "D2", Geslacht.X);
        System.out.println(x);

    }
}
