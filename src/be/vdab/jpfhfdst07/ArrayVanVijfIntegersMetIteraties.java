package be.vdab.jpfhfdst07;

public class ArrayVanVijfIntegersMetIteraties {
    public static void main(String[] args) {
        var integerArray = new int[5];
        for (var i = 0; i < integerArray.length; i++) {
            integerArray[i] = (int) (Math.random() * 100 + 1);
        }

        var som = 0;
        for (var element : integerArray) {
            System.out.println(element);
            som += element;
        }
        System.out.println("De som van de elementen van deze array is " + som);

        var gemiddelde = (float) som / integerArray.length;
        System.out.println("Het gemiddelde van de elementen van de array is: " + gemiddelde);
    }
}
