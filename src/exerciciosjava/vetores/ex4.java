package exerciciosjava.vetores;

import java.util.Locale;
import java.util.Scanner;

public class ex4 {

    static void main(String[] args) {

        /* 3- Faça um programa que leia N números inteiros e armazene-os em um vetor.
        Em seguida, mostre na tela todos os números pares, e também a quantidade de números pares.*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, qtdpares;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        int[] vect = new int[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("\nNUMEROS PARES: ");

        qtdpares = 0;
        for (int i=0; i<n; i++) {
            if (vect[i] % 2 == 0) {
                System.out.printf("%d ", vect[i]);
                qtdpares ++;
            }
        }

        System.out.printf("\n\nQUANTIDADE DE NUMEROS PARES = %d\n", qtdpares);

        sc.close();
    }
}

