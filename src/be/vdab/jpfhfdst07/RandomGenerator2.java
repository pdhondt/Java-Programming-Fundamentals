package be.vdab.jpfhfdst07;

public class RandomGenerator2 {
    public static void main(String[] args) {
        var getallen = new int[100];
        for (var i = 0; i < getallen.length; i++) {
            getallen[i] = (int) (Math.random() * 1000 + 1);
        }
        for (var j = 0; j < getallen.length - 1; j++) {
            for (var k = (j + 1); k < getallen.length; k++) {
                int temp;
                if (getallen[k] < getallen[j]) {
                    temp = getallen[j];
                    getallen[j] = getallen[k];
                    getallen[k] = temp;
                }
            }
        }

        for (var getal : getallen) {
            System.out.print(getal + "\t");
        }
    }
}
