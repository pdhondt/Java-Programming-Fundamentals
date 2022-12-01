package be.vdab.jpfhfdst09;

public class PersoonMain {
    public static void main(String[] args) {
        var persoon = new Persoon("Peter", "D'hondt");
        System.out.println(persoon.voornaam());
        System.out.println(persoon.achternaam());

        var persoon2 = new Persoon("Leo", "");
    }
}
