package be.vdab.jpfhfdst16;

public class IntroInExceptions {
    public static void main(String[] args) {
        try {
            var result = 7 / 0;
            System.out.println("Deze code wordt alleen uitgevoerd" +
                    " wanneer er geen fout optreedt.");
            System.out.println(result);
        }
        catch (ArithmeticException aex) { //aex = zelf gekozen naam voor het Exception object dat opgevangen wordt
            System.out.println("ArithmeticException: " + aex.getMessage()); //informatie van deze Exception wordt getoond dmv de method
            //getMessage(), die vrijwel bij elke Exception class voorzien is
        }

        try {
            var tekstje = "abc";
            var tekstjeInGetalwaarde = Integer.parseInt(tekstje);
            var result = tekstjeInGetalwaarde / 4;
            System.out.println(result);
        /*}
        catch (NumberFormatException nfex) {
            System.out.println("NumberFormatException: " + nfex.getMessage());*/
        }
        catch (IllegalArgumentException iaex) { //een NumberFormatException object is ook een IllegalArgumentException object
            System.out.println("IllegalArgumentException: " + iaex.getMessage());
        }

        try {
            var getallen = new int[] {12, 5, 28, 37};
            System.out.println("Het zevende element is: " + getallen[6]);
        /*}
        catch (ArrayIndexOutOfBoundsException aioobex) {
            System.out.println("ArrayIndexOutOfBoundsException: " + aioobex.getMessage());*/
        }
        catch (IndexOutOfBoundsException ioobex) { //een ArrayIndexOutOfBoundsException object is ook een IndexOutOfBoundsException object
            System.out.println("IndexOutOfBoundsException: " + ioobex.getMessage());
        }
        finally {
            System.out.println("Dit is een poging voor het tonen van de" +
                    " waarde van een element.");
        }

        //meerdere catch blokken bij één try blok
//        var tekst = "2";
//         var tekst = "6";
         var tekst = "abc";

        try {
            var cijfers = new int[] {12, 5, 28, 37};
            System.out.println("Element uit de array: " +
                    cijfers[Integer.parseInt(tekst)]);
            System.out.println("Deze code wordt enkel uitgevoerd" +
                    " wanneer er geen fout optreedt.");
        /*}
        catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBoundsException: " + ex.getMessage());
        }
        catch(NumberFormatException ex) {
            System.out.println("NumberFormatException: " + ex.getMessage());
        }
        catch (RuntimeException ex) {
            System.out.println("RuntimeException: " + ex.getMessage());*/
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException ex) { //OPGELET: enkele logische or operator!!!
            System.out.println(ex.getMessage());
        }

    }
}
