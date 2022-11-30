package be.vdab.jpfhfdst06;

public class ArrayVanVijfIntegers {
    public static void main(String[] args) {
        var integerArray = new int[5];
        integerArray[0] = (int) (Math.random() * 100 + 1);
        integerArray[1] = (int) (Math.random() * 100 + 1);
        integerArray[2] = (int) (Math.random() * 100 + 1);
        integerArray[3] = (int) (Math.random() * 100 + 1);
        integerArray[4] = (int) (Math.random() * 100 + 1);

        System.out.println(integerArray[0]);
        System.out.println(integerArray[1]);
        System.out.println(integerArray[2]);
        System.out.println(integerArray[3]);
        System.out.println(integerArray[4]);

        var som = integerArray[0] + integerArray[1] + integerArray[2] + integerArray[3] + integerArray[4];
        System.out.println("De som van de elementen van deze array is " + som);

        var gemiddelde = (float) som / integerArray.length;
        System.out.println("Het gemiddelde van de elementen van de array is: " + gemiddelde);
    }
}
