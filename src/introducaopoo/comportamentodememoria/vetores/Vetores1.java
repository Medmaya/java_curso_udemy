package introducaopoo.comportamentodememoria.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores1 {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int N = sc.nextInt();

        double[] vect = new double[N];
        System.out.println("Digite as alturas: ");

        for (int i = 0; i<N; i++) {
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i=0; i<N; i++) {
            sum += vect[i];
        }

        double avg = sum / N;

        System.out.println("AVERAGE HEIGHT " + avg);

        sc.close();
    }
}
