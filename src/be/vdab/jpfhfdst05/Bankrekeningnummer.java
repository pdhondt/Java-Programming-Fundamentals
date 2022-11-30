package be.vdab.jpfhfdst05;

public class Bankrekeningnummer {
    public static void main(String[] args) {
        /*
        Correcte rekeningnummers:
            823445816730
            237824199569
            662431212859
            737524091952
        Foutieve rekeningnummers:
            111224444891
            777553241844
         */
        var rekeningNummer = 662431212859L;
        var eerste10Cijfers = rekeningNummer / 100;
        var rest = eerste10Cijfers % 97;
        System.out.println(rest);
        var laatste2Cijfers = rekeningNummer % 100;
        System.out.println(laatste2Cijfers);
        var geldigRekeningNummer = (rest == laatste2Cijfers) ? "geldig" : "niet geldig";
        System.out.println("Rekeningnummer " + rekeningNummer + " is " + geldigRekeningNummer);
    }
}
