package exerciciosjava.vetores;

import java.util.Locale;
import java.util.Scanner;

public class ex11 {

    static void main(String[] args) {

        /* 11- Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas.
        Fazer um programa que calcule e escreva a maior e a menor altura do grupo,
        a média de altura das mulheres, e o número de homens.*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, qtdHomens, qtdMulheres;
        double menorAltura, maiorAltura, alturaFemininaTotal, mediaAlturaMulheres;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        double[] alturas = new double[n];
        char[] generos = new char[n];

        for (int i=0; i<n; i++) {
            System.out.print("Altura da " + (i+1) + "a pessoa: ");
            alturas[i] = sc.nextDouble();
            System.out.print("Genero da " + (i+1) + "a pessoa: ");
            generos[i] = sc.next().charAt(0);
        }

        menorAltura = alturas[0];
        maiorAltura = alturas[0];

        for (int i=0; i<n; i++) {
            if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }
            if (alturas[i] > maiorAltura ) {
                maiorAltura = alturas[i];
            }
        }

        qtdHomens = 0;
        qtdMulheres = 0;
        alturaFemininaTotal = 0.0;

        for (int i=0; i<n; i++) {
            if (generos[i] == 'M') {
                qtdHomens++;
            }
            else {
                qtdMulheres++;
                alturaFemininaTotal += alturas[i];
            }
        }

        mediaAlturaMulheres = alturaFemininaTotal / qtdMulheres;


        System.out.println("Menor altura = " + menorAltura);
        System.out.println("Maior altura = " + maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaMulheres);
        System.out.println("Numero de homens = " + qtdHomens);


        sc.close();
    }
}

