package be.vdab.jpfhfdst07;

public class RandomGenerator {
    public static void main(String[] args) {
        var getallenArray = new int[10000];
        for (var i = 0; i < getallenArray.length; i++) {
            getallenArray[i] = (int) (Math.random() * 100 + 1);
        }
        for (var j = 0; j <= 100; j++) {
            var count = 0;
            for (var getal : getallenArray) {
                if (getal == j) {
                    count++;
                }
            }
            System.out.println(j + " komt " + count + " keer voor");
        }
    }
}
