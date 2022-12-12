package be.vdab.jpfhfdst20;

public class JPFhfdst20 {
    public static void main(String[] args) {
        var tekst = "auto";
        System.out.println(tekst + ", hashcode: " + tekst.hashCode());

        tekst = "huis";
        System.out.println(tekst + ", hashcode: " + tekst.hashCode());
    }
}
