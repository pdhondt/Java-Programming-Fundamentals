package be.vdab.jpfhfdst05;

public class Studentscores {
    public static void main(String[] args) {
        var score1 = 8;
        var score2 = 6;
        var score3 = 9;
        var score4 = 4;
        final var MAX_SCORE = 10;
        var totaalScore = score1 + score2 + score3 + score4;
        var gemiddelde = totaalScore / 4F;
        var percentage = (gemiddelde / MAX_SCORE) * 100F;
        System.out.println("De gemiddelde score bedraagt " + gemiddelde + " op 10");
        System.out.println("Het percentage bedraagt " + percentage + "%");
    }
}
