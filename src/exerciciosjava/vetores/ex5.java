package exerciciosjava.vetores;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {

    static void main(String[] args) {

        /* Faça um programa que leia N números reais e armazene-os em um vetor.
        Em seguida, mostrar na tela o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
        considerando a primeira posição como 0 (zero).*/


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, posicaoMaiorValor;
        double maiorValor;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        double[] vect = new double[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        maiorValor = vect[0];
        posicaoMaiorValor = 0;

        for (int i=0; i<n; i++) {
            if (vect[i] > maiorValor) {
                maiorValor = vect[i];
                posicaoMaiorValor = i;
            }
        }

        System.out.print("MAIOR VALOR = " + maiorValor);
        System.out.print("\nPOSICAO DO MAIOR VALOR = " + posicaoMaiorValor);
    }
}
