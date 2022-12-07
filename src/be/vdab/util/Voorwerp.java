package be.vdab.util;

public interface Voorwerp {

    String EIGENAAR = "VDAB"; // final static moet niet voor String gezet worden, is impliciet bij interfaces
    void gegevensTonen();
    float winstBerekenen();
}
