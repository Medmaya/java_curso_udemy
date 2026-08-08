package introducaopoo.membrosestaticos.util;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double converterToReais(double dollarPrice, double dollarBougth) {
        double value = dollarPrice * dollarBougth;
        return value + (value * IOF);
    }
}
