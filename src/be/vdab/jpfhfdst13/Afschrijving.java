package be.vdab.jpfhfdst13;

public interface Afschrijving {
    int termijn(); // interface methods zijn impliciet public abstract
    double jaarlijksBedrag();

    default int tienjaarstermijn() {
        return 10;
    }

    static void beschrijving() {
        System.out.println("Een investering of aankoop verdelen over een " +
                "bepaalde termijn.");
    }
}
