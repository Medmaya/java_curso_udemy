package exerciciosjava.vetores;

import java.util.Locale;
import java.util.Scanner;

public class ex3 {

    static void main(String[] args) {

        /* 3- Fazer um progr
        ama para ler nome, idade e altura de N pessoas, conforme exemplo.
           Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem
           de pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver.*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, nmenores;
        double soma, media, percentualMenores;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i=0; i<n; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();

            System.out.print("Idade: ");
            idades[i] = sc.nextInt();

            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
            sc.nextLine();
        }

        nmenores = 0;
        soma = 0;
        for (int i=0; i<n; i++) {
            if (idades[i] < 16) {
                nmenores++;
            }
            soma += alturas[i];
        }

        media = soma / n;
        percentualMenores = ((double)nmenores / n) * 100.0;

        System.out.printf("Altura media: %.2f%n", media);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

        for (int i=0; i<n; i++) {
            if (idades[i] < 16) {
                System.out.printf("%s\n", nomes[i]);
            }
        }

        sc.close();
    }
}
