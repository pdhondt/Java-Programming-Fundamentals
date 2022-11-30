package be.vdab.jpfhfdst07;

public class RandomGeneratorAlternatief {
    public static void main(String[] args) {
        var integerArray = new int[100];
        for (var i = 0; i < 10000; i++) {
            var randomGetal = (int) (Math.random() * 100 + 1);
            integerArray[randomGetal - 1]++;
        }
        for (var j = 0; j < integerArray.length; j++) {
            System.out.println("Getal " + (j + 1) + " komt " + integerArray[j] + " keer voor");
        }
    }
}
