package introducaopoo.comportamentodememoria.vetores;

import introducaopoo.comportamentodememoria.vetores.entities.Vetor;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVetor {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de produtos: ");
        int N = sc.nextInt();

        Vetor[] vect = new Vetor[N];

        for (int i = 0; i < N; i++) {
            sc.nextInt();
            System.out.print("Nome: ");
            String nameV = sc.nextLine();
            System.out.println("Valor: ");
            double priceV = sc.nextDouble();
            vect[i] = new Vetor(nameV, priceV);
        }

        double sum = 0.0;
        for (int i = 0; i < N; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / N;

        System.out.printf("AVERAGE PRICE = %.2F%N", avg);

        sc.close();
    }
}
