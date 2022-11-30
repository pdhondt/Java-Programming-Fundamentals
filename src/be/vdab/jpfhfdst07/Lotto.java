package be.vdab.jpfhfdst07;

import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) {
        var lottoGetallen = new int[7];
        var lottoGetal = (int) (Math.random() * 42 + 1);
        lottoGetallen[0] = lottoGetal;
        for (var i = 1; i < lottoGetallen.length; i++) {
            lottoGetal = (int) (Math.random() * 42 + 1);
            for (var j = 0; j < i; j++) {
                while (lottoGetallen[j] == lottoGetal) {
                    lottoGetal = (int) (Math.random() * 42 + 1);
                }
            }
            lottoGetallen[i] = lottoGetal;
        }
        Arrays.sort(lottoGetallen, 0, 6);
        System.out.println("De 6 lottogetallen zijn: ");
        for (var i = 0; i < 6; i++) {
            System.out.print(lottoGetallen[i] + "\t");
        }
        System.out.println("\nHet reservegetal is " + lottoGetallen[6]);
    }
}
