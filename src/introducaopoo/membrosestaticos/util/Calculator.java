package introducaopoo.membrosestaticos.util;

public class Calculator {

    public final double PI = 3.14; //CONSTANTE (valor que nao pode ser alterado depois que foi definido pela palavra final)

    public double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
