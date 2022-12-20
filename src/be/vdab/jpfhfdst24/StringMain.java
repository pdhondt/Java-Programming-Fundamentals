package be.vdab.jpfhfdst24;

public class StringMain {
    public static void main(String[] args) {
        "Lambdafun".chars().forEach(unicode -> {
            System.out.print(unicode + ": ");
            System.out.println((char) unicode);
        });
    }
}
