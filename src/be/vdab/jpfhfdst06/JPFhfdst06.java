package be.vdab.jpfhfdst06;

public class JPFhfdst06 {
    public static void main(String[] args) {

        System.out.println("--- Impliciete initialisatie array ---");
        var getallen = new int[3];
        System.out.println("1e element uit int array:" + getallen[0]);
        System.out.println("2e element uit int array:" + getallen[1]);
        System.out.println("3e element uit int array:" + getallen[2]);
        System.out.println("");

        var chars = new char[3];
        System.out.println("1e element uit char array:" + chars[0]);
        System.out.println("2e element uit char array:" + chars[1]);
        System.out.println("3e element uit char array:" + chars[2]);
        System.out.println("");

        var vlaggen = new boolean[3];
        System.out.println("1e element uit boolean array:" + vlaggen[0]);
        System.out.println("2e element uit boolean array:" + vlaggen[1]);
        System.out.println("3e element uit boolean array:" + vlaggen[2]);
        System.out.println("");

        var kommagetallen = new float[3];
        System.out.println("1e element uit float array:" + kommagetallen[0]);
        System.out.println("2e element uit float array:" + kommagetallen[1]);
        System.out.println("3e element uit float array:" + kommagetallen[2]);
        System.out.println("");

        var namen = new String[3];
        System.out.println("1e element uit String array:" + namen[0]);
        System.out.println("2e element uit String array:" + namen[1]);
        System.out.println("3e element uit String array:" + namen[2]);
        System.out.println("");

        var lottogetallen = new byte[] {12, 15, 21, 23, 30, 40, 17};
        var lonen = new float[] {1250.63F, 1310.25F, 1546.88F};
        var voornamen = new String[] {"Lode", "Vie"};

        System.out.println(lottogetallen[2]);
        lottogetallen[2] = 19;
        System.out.println(lottogetallen[2]);
        System.out.println(lonen[1]);
        System.out.println(voornamen[0]);
        System.out.println(lottogetallen.length);
        lottogetallen[lottogetallen.length - 1] = 42;
        System.out.println(lottogetallen[lottogetallen.length - 1]);

        var nieuweLottogetallen = new byte[10];
        System.arraycopy(lottogetallen, 0, nieuweLottogetallen, 0, lottogetallen.length);
        System.out.println("1e element uit de nieuweLottogetallen byte array:" + nieuweLottogetallen[0]);
        System.out.println("2e element uit de nieuweLottogetallen byte array:" + nieuweLottogetallen[1]);
        System.out.println("3e element uit de nieuweLottogetallen byte array:" + nieuweLottogetallen[2]);
        System.out.println("4e element uit de nieuweLottogetallen byte array:" + nieuweLottogetallen[3]);
        System.out.println("5e element uit de nieuweLottogetallen byte array:" + nieuweLottogetallen[4]);
        System.out.println("6e element uit de nieuweLottogetallen byte array:" + nieuweLottogetallen[5]);
        System.out.println("7e element uit de nieuweLottogetallen byte array:" + nieuweLottogetallen[6]);
        System.out.println("8e element uit de nieuweLottogetallen byte array:" + nieuweLottogetallen[7]);
        System.out.println("9e element uit de nieuweLottogetallen byte array:" + nieuweLottogetallen[8]);
        System.out.println("10e element uit de nieuweLottogetallen byte array:" + nieuweLottogetallen[9]);
    }
}
