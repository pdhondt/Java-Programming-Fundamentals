package be.vdab.jpfhfdst07;

import java.util.Arrays;

public class RandomGenerator2MetSortMethod {
    public static void main(String[] args) {
        var getallen = new int[100];
        for (var i = 0; i < getallen.length; i++) {
            getallen[i] = (int) (Math.random() * 1000 + 1);
        }

        Arrays.sort(getallen);

        for (var getal : getallen) {
            System.out.print(getal + "\t");
        }
    }
}
