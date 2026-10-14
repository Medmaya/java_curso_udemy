package exerciciosjava;

import java.util.Locale;
import java.util.Scanner;

public class ex8 {

    static void main(String[] args) {

        /* 8- Fazer um programa para ler um vetor de N números inteiros.
            Em seguida, mostrar na tela a média aritmética somente dos números pares lidos,
            com uma casa decimal. Se nenhum número par for digitado,
            mostrar a mensagem "NENHUM NUMERO PAR" */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, npares;
        double soma, media;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        int[] vect = new int[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        soma = 0;
        npares = 0;
        for (int i=0; i<n; i++) {
            if (vect[i] % 2 == 0) {
                soma += vect[i];
                npares++;
            }
        }

        if (npares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        }
        else {
            media = soma / npares;
            System.out.printf("MEDIA DOS PARES = %.1f%n", media);
        }

        sc.close();
    }
}
