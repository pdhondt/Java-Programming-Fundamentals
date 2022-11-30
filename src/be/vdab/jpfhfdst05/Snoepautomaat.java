package be.vdab.jpfhfdst05;

public class Snoepautomaat {
    public static void main(String[] args) {
        var kostprijs = 0.42F;
        var teveel = 2 - kostprijs;
        var rest = 0F;
        var muntstukken1Euro = (int) (teveel / 1);
        rest = teveel % 1;
        var muntstukken50Cent = (int) (rest / 0.50);
        rest %= 0.50;
        var muntstukken20Cent = (int) (rest / 0.20);
        rest %= 0.20;
        var muntstukken10Cent = (int) (rest / 0.10);
        rest %= 0.10;
        var muntstukken5Cent = (int) (rest / 0.05);
        rest %= 0.05;
        var muntstukken2Cent = (int) (rest / 0.02);
        rest %= 0.02;
        var muntstukken1Cent = (int) (rest / 0.01);
        System.out.println("Munten van 1 EUR: " + muntstukken1Euro);
        System.out.println("Munten van 0,50 EUR: " + muntstukken50Cent);
        System.out.println("Munten van 0,20 EUR: " + muntstukken20Cent);
        System.out.println("Munten van 0,10 EUR: " + muntstukken10Cent);
        System.out.println("Munten van 0,05 EUR: " + muntstukken5Cent);
        System.out.println("Munten van 0,02 EUR: " + muntstukken2Cent);
        System.out.println("Munten van 0,01 EUR: " + muntstukken1Cent);
    }
}
